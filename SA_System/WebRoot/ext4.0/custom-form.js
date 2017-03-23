Ext.Loader.setConfig({enabled: true});
Ext.Loader.setPath('Ext.ux', 'ext4.0/ux');
Ext.require([
    'Ext.data.*',
    'Ext.panel.Panel',
    'Ext.view.View',
    'Ext.layout.container.Fit',
    'Ext.toolbar.Paging',
    'Ext.ux.form.SearchField'
]);

Ext.define('Answer', {
    extend: 'Ext.data.Model',
    idProperty: 'aid',
    fields: [
        {name: 'aid', mapping: 'aid'},
        {name: 'content', mapping: 'content'},
        {name: 'source', mapping: 'source'},
        {name: 'url', mapping: 'url'},
        {name: 'searchtime', mapping: 'searchtime', type: 'datetime', dateFormat: 'timestamp'},
        {name: 'type', mapping: 'type'}
    ]
});

Ext.onReady(function(){
    
    var forumId = 4;

    var store = Ext.create('Ext.data.Store', {
        model: 'Answer',
        proxy: {
            type: 'ajax',
            url: 'SearchAction_query',
            extraParams: {
                forumId: forumId
            },
            reader: {
                type: 'json',
                root: 'answerlist',
                totalProperty: 'totalCount'
            }
        },
        listeners: {
            beforeload: function(){
                var params = store.getProxy().extraParams;
                if (params.query) {
                    delete params.forumId;
                } else {
                    params.forumId = forumId;
                }
            }
        }
    });
    
    store.loadPage(1);

    var resultTpl = Ext.create('Ext.XTemplate',
        '<tpl for=".">',
        '<div class="search-item">',
//            '<p><span>{searchtime}<br />by {source}</span></p>',
            '<h3><a href={url} target="_blank">{content}</a></h3>',
            '<p><span>{searchtime}<br />by {source}</span></p>',
//            '<p>{type}</p>',
        '</div></tpl>',
    {
//        formatDate: function(value){
//            return Ext.Date.format(value, 'M j, Y');
//        }
    });

    var panel = Ext.create('Ext.panel.Panel', {
        title: '问题搜索',
        height: 300,
        width: 600,
        renderTo: 'search-panel',
        id: 'search-results',
        layout: 'fit',
        items: {
            autoScroll: true,
            xtype: 'dataview',
            tpl: resultTpl,
            store: store,
            itemSelector: 'div.search-item'
        },
        dockedItems: [{
            dock: 'top',
            xtype: 'toolbar',
            items: {
                width: 400,
                fieldLabel: 'Search',
                labelWidth: 50,
                xtype: 'searchfield',
                store: store
            }
        }, {
            dock: 'bottom',
            xtype: 'pagingtoolbar',
            store: store,
            pageSize: 25,
            displayInfo: true,
            displayMsg: 'Answers {0} - {1} of {2}',
            emptyMsg: 'No answers to display'
        }]
    });
});
