//列表页面上点击删除按钮弹出删除框
$(function () {
    $('.chakan').click(function () {
        //灰背景遮挡效果
        $('.zhezhao').css('display', 'block');
        $('#removeProv').fadeIn();
    });
    //点击 确定
    $('#yes').click(function () {
        $('.zhezhao').css('display', 'none');
        $('#removeProv').fadeOut();
    });

});
