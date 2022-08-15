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
    <script src="EditProfile.js"></script>
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
                        <ul class="list-group">
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
                    <h2 style="margin-left: 10px;">Add Employee</h2>
                </div>
                <div class="card" style="border: none;">

                    <div class="card-body px-4 pt-0">
                        <form action="AddEmployeeController" id="edit" onsubmit="myEditProfile(event)" method="post">
                            <div class="form-group" style="width: 100%;">
                                <label for="firstname" style="font-weight: bold;">
                                    First name<span style="color: red;">(*)</span></label>
                                <input required="" type="text" class="form-control" id="firstname" name="first"
                                    placeholder="First name">
                                <span id="errorFirstname"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="lastname" style="font-weight: bold;">
                                    Last name<span style="color: red;">(*)</span></label>
                                <input required="" type="text" class="form-control" id="lastname" name="last"
                                    placeholder="Last name">
                                <span id="errorLastname"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="phonenumber" style="font-weight: bold;">
                                    Phone number<span style="color: red;">(*)</span></label>
                                <input required="" type="text" class="form-control" id="phonenumber" name="phone"
                                    placeholder="Phone number">
                                <span id="errorPhonenumber"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="dateofbirth" style="font-weight: bold;">
                                    Date of birth<span style="color: red;">(*)</span></label>
                                <input required="" type="date" class="form-control" id="dateofbirth" name="date">
                                <span id="errorDate"></span>
                            </div>
                             <div class="form-group" style="width: 100%;">
                                <label for="gender" style="font-weight: bold;">
                                    Gender<span style="color: red;">(*)</span></label><br>
                                <input class="ml-5" name="gender" type="radio" id="female" value="Female">
                                <label>Female</label>
                                <input class="ml-5" name="gender" type="radio" id="male" value="Male">
                                <label>Male</label>
                                <span id="errorGender"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="account" style="font-weight: bold;">
                                    Account<span style="color: red;">(*)</span></label>
                                <input required="" type="text" class="form-control" id="account" name="account"
                                    placeholder="Account">
                                <span id="errorAccount"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="email" style="font-weight: bold;">
                                    Email<span style="color: red;">(*)</span></label>
                                <input required="" type="text" class="form-control" id="email" name="email"
                                    placeholder="Email">
                                <span id="errorEmail"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="password" style="font-weight: bold;">
                                    Password<span style="color: red;">(*)</span></label>
                                <input required="" type="password" class="form-control" id="password" name="pass"
                                    placeholder="Password">
                                <span id="errorPassword"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="address" style="font-weight: bold;">Address</label>
                                <textarea class="form-control" id="address" name="address" rows="3"></textarea>
                                <span id="errorAddress"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="status" style="font-weight: bold;">
                                    Status<span style="color: red;">(*)</span></label><br>
                                <input checked required="" type="checkbox" class="ml-5" id="status" name="status"
                                    placeholder="Status">
                                <label>Active</label>
                                <span id="errorStatus"></span>
                            </div>
                             <div class="form-group" style="width: 100%;">
                                <label for="department" style="font-weight: bold;">
                                    Department<span style="color: red;">(*)</span></label><br>
                                    <select class="form-control" name="department" id="cars">
                                    <option>Fsoft Academy</option>
                                    <option>Fsoft Academy</option>
                                    <option>Fsoft Academy</option>
                                    <option>Fsoft Academy</option>
                                </select>
                                <span id="errorDepartment"></span>
                            </div>
                            <div class="form-group" style="width: 100%;">
                                <label for="remark" style="font-weight: bold;">Remark</label>
                                <textarea class="form-control" id="remark" name="remark" rows="3"></textarea>
                                <span id="errorRemark"></span>
                            </div>
                            
                            <button  class="btn" 
                                style="border: 1px solid #ced4da; background-color: #58bfdd; color: white;"><a href="EmployeeController"><i
                                    class="fas fa-backward"></i> Back</a>
                            </button>
                            <button type="reset" class="btn" 
                                style="border: 1px solid #ced4da; background-color: #f0ad4e; color: white;"><i
                                    class="fas fa-undo"></i> Reset
                            </button>
                            <button type="submit" class="btn" 
                                style="border: 1px solid #ced4da; background-color: #5bb85b; color: white;"><i
                                    class="fas fa-plus"></i></i> Add
                            </button>
                        </form>
                        
                            
                    </div>
                </div>
            </div>
        </div>
    </section>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
        </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
        </script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
        </script>
    <!-- Code injected by live-server -->
    <script type="text/javascript">
        // <![CDATA[  <-- For SVG support
        if ('WebSocket' in window) {
            (function () {
                function refreshCSS() {
                    var sheets = [].slice.call(document.getElementsByTagName("link"));
                    var head = document.getElementsByTagName("head")[0];
                    for (var i = 0; i < sheets.length; ++i) {
                        var elem = sheets[i];
                        var parent = elem.parentElement || head;
                        parent.removeChild(elem);
                        var rel = elem.rel;
                        if (elem.href && typeof rel != "string" || rel.length == 0 || rel.toLowerCase() == "stylesheet") {
                            var url = elem.href.replace(/(&|\?)_cacheOverride=\d+/, '');
                            elem.href = url + (url.indexOf('?') >= 0 ? '&' : '?') + '_cacheOverride=' + (new Date().valueOf());
                        }
                        parent.appendChild(elem);
                    }
                }
                var protocol = window.location.protocol === 'http:' ? 'ws://' : 'wss://';
                var address = protocol + window.location.host + window.location.pathname + '/ws';
                var socket = new WebSocket(address);
                socket.onmessage = function (msg) {
                    if (msg.data == 'reload') window.location.reload();
                    else if (msg.data == 'refreshcss') refreshCSS();
                };
                if (sessionStorage && !sessionStorage.getItem('IsThisFirstTime_Log_From_LiveServer')) {
                    console.log('Live reload enabled.');
                    sessionStorage.setItem('IsThisFirstTime_Log_From_LiveServer', true);
                }
            })();
        }
        else {
            console.error('Upgrade your browser. This Browser is NOT supported WebSocket for Live-Reloading.');
        }
	// ]]>
    </script>


</body>


</html>