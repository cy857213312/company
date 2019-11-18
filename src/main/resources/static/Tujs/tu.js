gvChartInit();
$(document).ready(function(){

	/*折线图ͼ*/
	$('#oldday').gvChart({
		chartType: 'LineChart',
		gvSettings: {
			vAxis: {title: '评估分数'},
			hAxis: {title: '日期'},
			width: 1100,
			height: 350
		}
	});
	/*饼图*/
	$('#todayin').gvChart({
		chartType: 'PieChart',
		gvSettings: {
			width: 500,
			height: 350
		}
	});
});