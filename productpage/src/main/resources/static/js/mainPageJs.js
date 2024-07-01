const tabs = document.querySelectorAll('.goods_kinds');
const contents = document.querySelectorAll('.content');

tabs.forEach(goods_kinds => {
    goods_kinds.addEventListener('click', () => {
        const target = goods_kinds.getAttribute('data-target');
        const targetContent = document.getElementById(target);

        // Remove 'active' class from all tabs and contents
        tabs.forEach(tab => tab.classList.remove('active'));
        contents.forEach(content => content.classList.remove('active'));

        // Add 'active' class to the clicked tab and corresponding content
        goods_kinds.classList.add('active');
        targetContent.classList.add('active');
    });
});

