feather.replace();

jQuery(function ($) {
    var $datePicker = $('.datepicker');
    if ($datePicker.datepicker) {
        $datePicker.datepicker({format: 'yyyy-mm-dd'});
    }

    $('#modal').on('show.bs.modal', function (event) {
        const id = event.relatedTarget.dataset.id;
        const address = event.relatedTarget.dataset.address;
        $('#deleteForm').attr('action', `/admin/repair/${id}/delete`);
        $('.modal-title').text(function () {
            return `Repair with Address: ${address} `;
        });
    });
});