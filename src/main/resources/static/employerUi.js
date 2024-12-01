document.querySelectorAll('.employers').forEach(table => {
    table.addEventListener('mouseenter', () => {
        document.querySelector('.overlay').classList.add('active');
    });

    table.addEventListener('mouseleave', () => {
        document.querySelector('.overlay').classList.remove('active');
    });
});