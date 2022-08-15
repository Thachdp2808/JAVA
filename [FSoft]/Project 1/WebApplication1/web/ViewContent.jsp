<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <title>Document</title>
    </head>



    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light justify-content-between pt-0 pb-0"
             style="/* border-bottom: 1px solid #e1e1e1; */">
            <a class="navbar-brand" href="#" style="color: #777777;"><i class="fas fa-users" style="color: #777777;"></i>
                Employee</a>
            <div>
                <a href="">Welcome ${a}</a>
                &nbsp; &nbsp; &nbsp;
                <a href="LoginController"><i class="fas fa-sign-out-alt"></i>Logout</a>
            </div>
        </nav>

        <section class="container mx-0" style="max-width: 100%;">
            <div class="row" style="border: none;">
                <div class="col-md-2 px-0 pt-0 rounded-0" style="background-color: #f7f7f7; ">
                    <div class="card" style="border-radius: 0; border: 0;">
                        <div class="card-body p-0" style="border: 0; border-radius: 0;">
                            <ul class="list-group" style="border-bottom: 1px solid #d8d8d8 ;">
                                <li class="list-group-item"
                                    style="background-color: #f7f7f7; border-right:0; border-top:0; border-radius: 0;">
                                    <a href=""><i class="fas fa-tachometer-alt"></i> Dashboard</a>
                                </li>
                                <li class="list-group-item"
                                    style="background-color: #f7f7f7; border-right: 0; border-bottom: 0;">
                                    <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="true"
                                       class="dropdown-toggle"><i class="fas fa-chart-area"></i> Employee manager</a>
                                    <ul class="list-unstyled collapse show" id="homeSubmenu" style="">
                                        <li style="padding-left:20px ; font-size: 15px; padding-top: 10px;">
                                            <a href="EmployeeController"><i class="fas fa-list"></i> Employee list</a>
                                        </li>
                                        <li style="padding-left:20px ;font-size: 15px; padding-top: 10px;">
                                            <a href="AddEmployeeController"><i class="fas fa-plus"></i> Add Employee</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-md-10 pb-5" style="border-left: 1px solid #dcdcdc;border-top: 1px solid #dcdcdc;">
                    <div class="title mt-3" style="border-bottom: 1px solid #f4f4f4;">
                        <h2 style="margin-left: 10px;">Employee list</h2>
                    </div>

                    <div class="container mw-100 p-0 m-0">
                        <div class="row p-0 w-100 m-0">
                            <div class="col-lg-4 col-md-12 col-sm-12">
                            </div>
                            <div class="col-lg-8 col-md-12 col-sm-12 filter py-3 px-0  flex-no-wrap">
                                <!-- form search -->
                                <form action="EmployeeController" class="form-inline my-2 my-lg-0 justify-content-end" style="flex: 0.5;" method="POST">
                                    <!-- <button class="btn btn-light border my-2 my-sm-0 remove-border-radius-right"
                                        type="submit">
                                        <i class="fa fa-search" aria-hidden="true"></i>
                                    </button>
                                    <input class="form-control w-50 remove-border-radius-left mr-3" type="search"
                                        placeholder="User Search" aria-label="Search"> -->



                                    <div class="input-group" style="margin-right: 10px;">
                                        <div class="input-group-prepend">
                                            <button id="button-addon8" type="submit" class="btn"
                                                    style="border: 1px solid #e3e3e3 ;"> <i class="fa fa-search"> </i> </button>
                                        </div>
                                        <input type="search" placeholder="User Search" aria-describedby="button-addon8" name="search"
                                               class="form-control" style="width: 300px;">
                                    </div>

                                    <div class="input-group" style="margin-right: 10px;">
                                        <div class="input-group-prepend">
                                            <button id="button-addon8" type="submit" class="btn"
                                                    style="border: 1px solid #e3e3e3 ;"> <i class="fas fa-filter"></i> Filter
                                                by:</button>
                                        </div>
                                        <select class="form-control" id="exampleFormControlSelect1" aria-placeholder="Name" name="option">
                                            <option selected>ID</option>
                                            <option>Name</option>
                                            
                                            <option>Date</option>
                                            <option>Phone</option>
                                            <option>Address</option>
                                            <option>Department</option>
                                            
                                        </select>
                                    </div>

                                    <button class="btn btn-light border " type="submit"
                                            style="background-color: #5bc0de; color: white;">Search</button>
                                </form>
                            </div>
                        </div>
                        <form id="view-content" class="form-edit-content w-100 table-responsive-sm" action="profile.html"
                              method="post" style="width: 100%;">
                            <table class="table table-striped table-bordered">
                                <thead style="background-color: #eeeeee;">
                                    <tr>
                                        <th  class="border">
                                            ID
                                        </th>
                                        <th  class="border">
                                            Name
                                        </th>
                                        <th  class="border">
                                            Date Of Birth
                                        </th>
                                        <th  class="border">
                                            Address
                                        </th>
                                        <th  class="border">
                                            Phone number
                                        </th>
                                        <th  class="border">
                                            Department
                                        </th>
                                        <th style="width: 8%;" class="border">
                                            Action
                                        </th>
                                    </tr>
                                </thead>
                                <tbody >
                                    <c:forEach items="${requestScope.emp}" var="p">
                                        <tr >

                                            <td >
                                                ${p.employee_id}
                                            </td>
                                            <td >
                                                ${p.first_name} ${p.last_name}
                                            </td>
                                            <td >
                                                ${p.date}
                                            </td>
                                            <td >
                                                ${p.address}
                                            </td>
                                            <td >
                                                ${p.phone}
                                            </td>
                                            <td >
                                                ${p.department_name}
                                            </td>
                                            <td >
                                                <i class="fas fa-eye" style="color: #2f78b5;"></i><a href="ViewController?id=${p.employee_id}"> View</a>
                                                <a onclick="Delete(${p.employee_id})"> Delete</a>
                                            </td>


                                        </tr>
                                    </c:forEach>

                                </tbody>
                            </table>
                        </form>
                        <div class="col-sm-12 col-md-5 p-0">
                            <div class="dataTables_paginate paging_simple_numbers" id="dataTable_paginate">
                                <ul class="pagination">
                                    <li class="page-item ${page==1?"disabled":""}"><a class="page-link" href="EmployeeController?page=${page-1}" >Previous</a></li>
                                        <c:forEach begin="1" end="${totalPage}" var="i">
                                        <li class="page-item ${i == page?"active":""}"><a class="page-link" href="EmployeeController?page=${i}">${i}</a></li>
                                        </c:forEach>
                                    <li class="page-item ${page==totalPage?"disabled":""}"><a class="page-link "  href="EmployeeController?page=${page+1}">Next</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script>
            function Delete(id) {
                var option = confirm('Are you sure to delete?');
                if (option === true) {
                    window.location.href = 'DeleteController?id=' + id;
                }
            }
        </script>      
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
        </script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
        </script>

    </body>


</html>