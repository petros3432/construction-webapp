
$(document).ready(function () {
    // $('#empTable').dataTable();

    data = [
        { typeOfRerpair: 'typeOfRerpair1', address: 'address1', cost: 'cost1', state: 'state1' , sceduledDate: 'sceduledDate1',},
        { typeOfRerpair: 'typeOfRerpair2', address: 'address2', cost: 'cost2', state: 'state2', sceduledDate: 'sceduledDate2',},
        { typeOfRerpair: 'typeOfRerpair3', address: 'address3', cost: 'cost3',state: 'state3' , sceduledDate: 'sceduledDate3',}
    ]

    if (data && data.length) {
        for (let i = 0; i < data.length; i++) {
            console.log('data', data[i])
            $('.content').append('<tr class=row' + i + '>' +
                '<td>' + data[i].typeOfRerpair + '</td>'+
                '<td>' + data[i].address + '</td>'+
                '<td>' + data[i].cost + '</td>'+
                '<td>' + data[i].state + '</td>'+
                '<td>' + data[i].sceduledDate + '</td>' +
                '<td>' +
                '<button data-toggle="modal" data-target="#DetailModal" class="btn btn-success btn-sm">'+
                '<span class="glyphicon glyphicon-floppy-open"></span>Detail</button>'+
                '<button data-toggle="modal" class="btn btn-warning btn-sm"><span class="glyphicon glyphicon-edit"></span> Edit</button>'+
                '<button  id=' + i + ' data-toggle="modal" class="delete btn btn-danger btn-sm" onclick="removeRow(' + i + ')">'+
                '<span class="glyphicon glyphicon-trash"></span> Delete</button></td></tr>')

        }
    }


})

function removeRow(id) {
    console.log('i', id)
    $('.row' + id).remove()
}