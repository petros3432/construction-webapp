feather.replace();

jQuery(function ($) {
    $('#modal').on('show.bs.modal', function (event) {
        const id = event.relatedTarget.dataset.id;
        $('#deleteForm').attr('action', `/owner/${id}/delete`);
        $('.modal-title').text(function () {
            return `Owner with Security Number#${id}`;
        });
    });
});