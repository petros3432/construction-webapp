feather.replace();

jQuery(function ($) {
    var $datePicker = $('.datepicker');
    if ($datePicker.datepicker) {
        $datePicker.datepicker({format: 'yyyy-mm-dd'});
    }

    $('#modal').on('show.bs.modal', function (event) {
        const id = event.relatedTarget.dataset.id;
        const afm = event.relatedTarget.dataset.afm;
        const name = event.relatedTarget.dataset.name;
        $('#deleteForm').attr('action', `/admin/owner/${id}/delete`);
        $('.modal-title').text(function () {
            return `Owner: ${name} with AFM: #${afm}`;
        });
    });
});