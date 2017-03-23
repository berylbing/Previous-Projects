<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>网络论坛热点话题发现系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link href="css/main.css" rel="stylesheet" type="text/css"  />
	<link rel="stylesheet" type="text/css" href="ext4.0/css/ext-all.css" />  
	<script type="text/javascript" src="ext4.0/ext-all.js"  ></script> 
	 <script type="text/javascript">





Ext.onReady(function(){
	
    
    //use a renderer for values in the data view.

    var bd = Ext.getBody(),
        form = false,
        rec = false,
        selectedStoreItem = false,
        //performs the highlight of an item in the bar series
        selectItem = function(storeItem) {
            var name = storeItem.get('title'),
                series = barChart.series.get(0),
                i, items, l;
            
            series.highlight = true;
            series.unHighlightItem();
            series.cleanHighlights();
            for (i = 0, items = series.items, l = items.length; i < l; i++) {
                if (name == items[i].storeItem.get('title')) {
                    selectedStoreItem = items[i].storeItem;
                    series.highlightItem(items[i]);
                    break;
                }
            }
            series.highlight = false;
        },
        
        //updates a record modified via the form
        updateRecord = function(rec) {
            var name, series, i, l, items, json = [{
                'Name': '2012-01-11 00:00',
                'Data': rec.get('energy0')
            }, {
            	'Name': '2012-01-12 00:00',
                'Data': rec.get('energy1')
            }, {
                'Name': '2012-01-13 00:00',
                'Data': rec.get('energy2')
            }, {
                'Name': '2012-01-14 00:00',
                'Data': rec.get('energy3')
            },{
                'Name': '2012-01-15 00:00',
                'Data': rec.get('energy4')
            },{
                'Name': '2012-01-16 00:00',
                'Data': rec.get('energy5')
            },{
                'Name': '2012-01-17 00:00',
                'Data': rec.get('energy6')
            },
         //   {
           //     'Name': 'slot7',
           //     'Data': rec.get('energy')
          //  }
            ];
            chs.loadData(json);
            selectItem(rec);
        },
        createListeners = function() {
            return {
                // buffer so we don't refire while the user is still typing
                buffer: 200,
                change: function(field, newValue, oldValue, listener) {
                    form.updateRecord(rec);
                    updateRecord(rec);
                }
            };
        };
        
        var ds = Ext.create('Ext.data.Store', {
		    id:'simpsonsStore',
		    autoLoad: true,
		    fields:['title', 'energy', 'num', 'energy6','energy5','energy4','energy3','energy0','energy1','energy2'],
<%--			    pageSize: itemsPerPage, // items per page--%>
		    proxy: {
		        type: 'ajax',
		        url: 'extjs.action',  // url that will load data with respect to start and limit params
		        reader: {
					totalRecords : "results",
		            type: 'json',
		            root: 'items',
		            totalProperty: 'total'
		        }
		    }
		});
    
    //create radar dataset model.
    var chs = Ext.create('Ext.data.JsonStore', {
        fields: ['Name', 'Data'],
        data: [
        	{
                'Name': 'slot0',
                'Data': 100
            }, {
            	'Name': 'slot1',
                'Data': 100
            }, {
                'Name': 'slot2',
                'Data': 100
            }, {
                'Name': 'slot3',
                'Data': 100
            }, {
                'Name': 'slot4',
                'Data': 100
            },{
                'Name': 'slot5',
                'Data': 100
            },{
                'Name': 'slot6',
                'Data': 100
            },{
                'Name': 'slot7',
                'Data': 100
            }]
    });

    
    //create a grid that will list the dataset items.
   var gridPanel = Ext.create('Ext.grid.Panel', {
        id: 'company-form',
        flex: 0.60,
        store: ds,
        title:'热点话题',

        columns: [
            {
                id       :'title',
                text   : 'Title',
                flex: 1,
                sortable : true,
                dataIndex: 'title'
            },
            {
                text   : 'Num',
                width    : 75,
                sortable : true,
                dataIndex: 'num',
            },
            {
                text   : 'Energy',
                width    : 75,
                sortable : true,
                dataIndex: 'energy',
            }
        ],

        listeners: {
            selectionchange: function(model, records) {
                var json, name, i, l, items, series, fields;
                if (records[0]) {
                    rec = records[0];
                    form = form || this.up('form').getForm();
                    fields = form.getFields();
                    // prevent change events from firing
                    fields.each(function(field){
                        field.suspendEvents();
                    });
                    form.loadRecord(rec);
                    updateRecord(rec);
                    fields.each(function(field){
                        field.resumeEvents();
                    });
                }
            }
        }
    });

  //create a bar series to be at the top of the panel.
   var barChart = Ext.create('Ext.chart.Chart', {
        flex: 1,
        shadow: true,
        animate: true,
        store: ds,
        axes: [{
            type: 'Numeric',
            position: 'left',
            fields: ['energy'],
            minimum: 0,
            label: {
                font: '12px Arial'
            },
            hidden: true
        }, {
            type: 'Category',
            position: 'bottom',
            fields: ['title'],
            label: {
                font: '12px Arial'
            }
        }],
        series: [{
            type: 'column',
            axis: 'left',
            highlight: true,
            style: {
                fill: '#456d9f'
            },
            highlightCfg: {
                fill: '#a2b5ca'
            },
            label: {
                display: 'insideEnd',
                field: 'energy',
                color: '#000',
                orientation: 'vertical',
                'text-anchor': 'middle'
            },
            listeners: {
                'itemmouseup': function(item) {
                     var series = barChart.series.get(0),
                         index = Ext.Array.indexOf(series.items, item),
                         selectionModel = gridPanel.getSelectionModel();
                     
                     selectedStoreItem = item.storeItem;
                     selectionModel.select(index);
                }
            },
            xField: 'name',
            yField: ['energy']
        }]        
    });
    
    //disable highlighting by default.
    barChart.series.get(0).highlight = false;
    
    //add listener to (re)select bar item after sorting or refreshing the dataset.
    barChart.addListener('beforerefresh', (function() {
        var timer = false;
        return function() {
            clearTimeout(timer);
            if (selectedStoreItem) {
                timer = setTimeout(function() {
                    selectItem(selectedStoreItem);
                }, 900);
            }
        };
    })());
    
    //create a line series to be at the top of the panel.
    var lineChart = Ext.create('Ext.chart.Chart', {
    	margin: '0 0 0 0',
<%--        insetPadding: 20,--%>
        flex: 1.2,
        animate: true,
        store: chs,
        shadow: true,
<%--	    theme: 'topicEnergy',--%>
	    axes: [{
	        type: 'Numeric',
	        minimum: 0,
	        position: 'left',
	        fields: ['Data'],
	        title: '话题能量值'
	    }, {
	        type: 'Category',
	        position: 'bottom',
	        fields: ['Name'],
	        title: '时间'
	    }],

	    // Add line series
	    series: [{
	        type: 'line',
	        axis: 'left',
	        xField: 'Name',
	        yField: 'Data',
	        markerConfig: {
	            type: 'cross',
	            size: 4,
	            radius: 4,
	            'stroke-width': 0
	        },
	    	label: {
            	font: '9px Arial'
        	}
	    }]
	});
	
    /*
     * Here is where we create the Form
     */
 
     var gridForm = Ext.create('Ext.form.Panel', {
         title: '热点话题能量柱状图',
         frame: true,
         bodyPadding: 5,
         width: 870,
         height: 700,
         
         
         fieldDefaults: {
             labelAlign: 'left',
             msgTarget: 'side'
         },
     
         layout: {
             type: 'vbox',
             align: 'stretch'
         },
         
         items: [
             {
                 height: 200,
                 layout: 'fit',
                 margin: '0 0 3 0',
                 items: [barChart]
             },
             {
             
             layout: {type: 'hbox', align: 'stretch'},
             flex: 3,
             border: false,
             bodyStyle: 'background-color: transparent',
             
             items: [gridPanel, {
                 flex: 0.4,
                 layout: {
                     type: 'vbox',
                     align:'stretch'
                 },
                 margin: '0 0 0 5',
                 title: '话题信息',
                 items: [{
                     margin: '5',
                     xtype: 'fieldset',
                     flex: 1,
                     title:'话题信息',
                     defaults: {
                         width: 240,
                         labelWidth: 90
                     },
                     defaultType: 'textfield',
                     items: [{
                         fieldLabel: 'Title',
                         name: 'title',
                         disabled: true
                     },{
                         fieldLabel: 'Num',
                         name: 'num',
                         disabled: true
<%--                         listeners: createListeners('num')--%>
                     },{
                         fieldLabel: 'Energy',
                         name: 'energy',
                         disabled: true
<%--                         listeners: createListeners('energy')--%>
                     }]
                 }, lineChart]
             }]
         }],
         renderTo: bd
     });

    var gp = Ext.getCmp('topics-form');
});
	</script>
	
  </head>
  
 <body>
<div id="doc">
 <div id="header">
   <img src="images/bt.png" alt="网络论坛热点话题发现系统" />
 </div>
 <!--header-->
 <div id="menu">
					<div class="rightbg">
						<div class="leftbg">
							<div class="padding">
								<ul>
									<li><a href="#">兵马俑BBS</a></li>
									<li><a href="#">新浪微博</a></li>
									<li><a href="#">关于我们</a></li>
									<li><a href="#">联系我们</a></li>
								</ul>
								<br class="clear" />
							</div>
						</div>
					</div>
  </div>
 <div id="main"> 
 </div>
 

  <div id = "bd"></div>
  <div class="clear"></div>
 </div>
 <!--main-->
 <div id="footer">
 <hr />
 </div>
</body>
 <!--doc-->
</html>
