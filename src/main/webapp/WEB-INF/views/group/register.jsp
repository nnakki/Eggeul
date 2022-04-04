<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@include file="../includes/header.jsp" %>

<!-- 상단 이미지 -->
<div class="head-image">
    <div class="head-content" onclick="location.href='/group/register'">
        <p>모임만들기</p>
    </div>
</div>
<!-- 상단 이미지 -->

<div class="container group-register">
    <form role="form" action="/group/register" method="post">
        <h4 style="margin-top : 3rem; margin-bottom : 3rem;">모임정보입력</h4>
        <div class="form-group">
            <label for="userId" hidden>아이디</label>
            <input type="text" class="form-control" id="userId" name="userId" required
            value="${pinfo.username}" readonly="readonly" hidden>
        </div>

        <div class="form-group">
            <label for="name">모임명</label>
            <input type="text" class="form-control" name="name" id="name" required>
        </div>

        <div class="form-group">
            <label for="category">카테고리</label>
            <select class="form-control" id="category" name="category" required>
                <option value="select">-------------</option>
                <option value="GRCA01">여행</option>
                <option value="GRCA02">반려동물</option>
                <option value="GRCA03">외국어</option>
                <option value="GRCA04">음악</option>
                <option value="GRCA05">전자기기</option>
                <option value="GRCA06">맛집</option>
                <option value="GRCA07">만화</option>
                <option value="GRCA08">게임</option>
                <option value="GRCA09">자동차</option>
                <option value="GRCA10">요리</option>
                <option value="GRCA11">기타</option>
            </select>
        </div>

        <div class="form-group">
            <label for="description">간단소개</label>
            <textarea class="form-control" rows="2" id="description" name="description" required></textarea>
        </div>

        <div class="form-group">
            <label for="info">모임정보</label>
            <textarea class="form-control" rows="20" id="info" name="info" required></textarea>
        </div>

        <div class="form-group">
        <div class="form-row">
            <div class="col">
            <label for="sido">시</label>
            <select class="form-control" id="sido" name="sido">
                <option value="select">-------------</option>
                <option value="LODO01">서울특별시</option>
            </select>
            </div>
            <div class="col">
                <label for="sigungu">구</label>
                <select class="form-control" id="sigungu" name="sigungu">
                    <option value="select">-------------</option>
                    <option value="LOGU01" hidden="hidden">강남구</option>
                    <option value="LOGU02" hidden="hidden">강동구</option>
                    <option value="LOGU03" hidden="hidden">강북구</option>
                    <option value="LOGU04" hidden="hidden">강서구</option>
                    <option value="LOGU05" hidden="hidden">관악구</option>
                    <option value="LOGU06" hidden="hidden">광진구</option>
                    <option value="LOGU07" hidden="hidden">구로구</option>
                    <option value="LOGU08" hidden="hidden">금천구</option>
                    <option value="LOGU09" hidden="hidden">노원구</option>
                    <option value="LOGU10" hidden="hidden">도봉구</option>
                    <option value="LOGU11" hidden="hidden">동대문구</option>
                    <option value="LOGU12" hidden="hidden">동작구</option>
                    <option value="LOGU13" hidden="hidden">마포구</option>
                    <option value="LOGU14" hidden="hidden">서대문구</option>
                    <option value="LOGU15" hidden="hidden">서초구</option>
                    <option value="LOGU16" hidden="hidden">성동구</option>
                    <option value="LOGU17" hidden="hidden">성북구</option>
                    <option value="LOGU18" hidden="hidden">송파구</option>
                    <option value="LOGU19" hidden="hidden">양천구</option>
                    <option value="LOGU20" hidden="hidden">영등포구</option>
                    <option value="LOGU21" hidden="hidden">용산구</option>
                    <option value="LOGU22" hidden="hidden">은평구</option>
                    <option value="LOGU23" hidden="hidden">종로구</option>
                    <option value="LOGU24" hidden="hidden">중구</option>
                    <option value="LOGU25" hidden="hidden">중랑구</option>
                </select>
            </div>
        </div>
        </div>

<!--대표사진 주석
        <p>대표사진</p>
        <div class="form-group">
            <div class="uploadDiv">
            <div class="custom-file">
            <label for="uploadFile" class="custom-file-label">없음</label>
            <input type="file" class="form-control custom-file-input" id="uploadFile" name="uploadFile" accept="image/*">
            <div class="uploadResult">
                <ul>

                </ul>
            </div>
            </div>
            </div>
        </div>
-->


        <div class="form-group">
            <label for="tags">태그</label>
            <select class="form-control" id="tags" name="tags">
                <option value="select">-------------</option>
                <option value="GRTG01">국내여행</option>
                <option value="GRTG02">해외여행</option>
                <option value="GRTG03">고양이</option>
                <option value="GRTG04">강아지</option>
                <option value="GRTG05">햄스터</option>
                <option value="GRTG06">파충류</option>
                <option value="GRTG07">영어</option>
                <option value="GRTG08">일본어</option>
                <option value="GRTG09">중국어</option>
                <option value="GRTG10">프랑스어</option>
                <option value="GRTG11">러시아어</option>
                <option value="GRTG12">핸드폰</option>
                <option value="GRTG13">PC/태블릿</option>
                <option value="GRTG14">가전제품</option>
                <option value="GRTG15">한식</option>
                <option value="GRTG16">분식</option>
                <option value="GRTG17">일식</option>
                <option value="GRTG18">양식</option>
                <option value="GRTG19">중식</option>
                <option value="GRTG20">지브리</option>
                <option value="GRTG21">디즈니</option>
                <option value="GRTG22">메이플스토리</option>
                <option value="GRTG23">롤</option>
                <option value="GRTG24">배틀그라운드</option>
                <option value="GRTG25">로스트아크</option>
                <option value="GRTG26">카트라이더</option>
                <option value="GRTG27">오버워치</option>
                <option value="GRTG28">테일즈런너</option>
                <option value="GRTG29">서든어택</option>
                <option value="GRTG30">레인보우식스시즈</option>
                <option value="GRTG31">스포츠카</option>
                <option value="GRTG32">경형</option>
                <option value="GRTG33">소형</option>
                <option value="GRTG34">준중형</option>
                <option value="GRTG35">중형</option>
                <option value="GRTG36">준대형</option>
                <option value="GRTG37">대형</option>
                <option value="GRTG38">꿀팁</option>
                <option value="GRTG39">레시피</option>
                <option value="GRTG40">기타</option>
            </select>
        </div>



        <sec:csrfInput/>
        <button type="submit" class="btn btn-primary">등록</button>
        <button type="reset" class="btn btn-secondary">목록</button>
    </form>
</div>

<!-- 유효성검사 -->
<script>
    function validation() {
        if($('#category > option:selected').val() == "select") {
            alert("카테고리를 입력해주세요");
            return false;
        }

        if(getByte($('#name').val()) == "") {
            alert("모임명을 입력해주세요");
            return false;
        } else if(getByte($('#name').val()) > 70) {
            alert("모임명을 20자 이하로 작성해주세요");
            return false;
        }

        if(getByte($('#description').val()) == "") {
            alert("간단소개를 입력해주세요");
            return false;
        } else if(getByte($('#description').val()) > 300) {
            alert("간단소개를 90자 이내로 작성해주세요")
            return false;
        }

        if(getByte($('#info').val()) == "") {
            alert("모임정보를 입력해주세요");
            return false;
        } else if(getByte($('#info').val()) > 4000) {
            alert("모임 정보가 너무 깁니다");
            return false;
        }

        if($('#sido > option:selected').val() == "select") {
            alert("지역을 입력해주세요");
            return false;
        }

        if($('#sigungu > option:selected').val() == "select") {
            alert("지역을 입력해주세요");
            return false;
        }

        if($('#tags > option:selected').val() == "select") {
            alert("태그를 입력해주세요");
            return false;
        }

        return true;
    }

    function getByte(str) {
        let byte = 0;
        for (let i=0; i<str.length; ++i) {
            (str.charCodeAt(i) > 127) ? byte += 3 : byte++ ;
        }
        return byte;
    }
</script>

<script>

    $(document).ready(function(e) {

        let formObj = $("form[role='form']");
        let regex = new RegExp("(.*?)\.(png|jpg|jpeg|bmp|gif)$");
        let maxSize = 5242880;
        let csrfHeaderName = "${_csrf.headerName}";
        let csrfTokenValue = "${_csrf.token}";

        $("button[type='submit']").on("click", function(e) {

            e.preventDefault();

            console.log("submit clicked");

            if(!validation()) {
                return;
            }

            //$("#info").val($("#info").val().replace(/(?:\r\n|\r|\n)/g, '<br/>'));
            //console.log($("#info").val());


            let str = "";

            $('.uploadResult ul li').each(function(i, obj) {

                let jobj = $(obj);

                console.dir(jobj);

                str += "<input type='hidden' name='attach.fileName' value='"+jobj.data("filename")+"'>";
                str += "<input type='hidden' name='attach.uuid' value='"+jobj.data("uuid")+"'>";
                str += "<input type='hidden' name='attach.uploadPath' value='"+jobj.data("path")+"'>";
                str += "<input type='hidden' name='attach.fileType' value='"+jobj.data("type")+"'>";

            })

            formObj.append(str).submit();
        })

        $("button[type='reset']").on("click", function(e) {
            e.preventDefault();

            window.location.href = "/group/list";
            //formObj.attr("action", '/group/list').attr('method', 'get');
            //formObj.submit();
        })

        $("input[type='file']").change(function(e) {

            let formData = new FormData();

            let inputFile = $("input[name='uploadFile']");

            let file = inputFile[0].files[0];

            console.log(file);

            //let files = inputFile[0].files;

            if(!checkExtension(file.name, file.size)) {
                return false;
            }

            formData.append("uploadFile", file);

            // for(let i=0; i<files.length; i++) {
            //
            //     if(!checkExtension(files[i].name, files[i].size)) {
            //         return false;
            //     }
            //     formData.append("uploadFile", files[i]);
            // }

            $.ajax({
                url: '/uploadAjaxAction',
                processData: false,
                contentType: false,
                beforeSend: function(xhr) {
                    xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
                },
                data: formData,
                type: 'POST',
                dataType:'json',
                success: function(result) {
                    console.log(">>>>>>>" + result);
                    showUploadResult(result);
                },
                error: function (result) {
                    console.log(">>>>>>>" + result);
                }
            })

        })

        $(".uploadResult").on("click", "button", function(e) {
            console.log("delete file");

            let targetFile = $(this).data("file");
            let type = $(this).data("type");

            let targetLI = $(this).closest("li");

            $('.custom-file-label').html("없음");

            $.ajax({
                url: '/deleteFile',
                data: {fileName: targetFile, type:type},
                beforeSend: function(xhr) {
                    xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
                },
                dataType:'text',
                type: 'POST',
                success: function(result) {
                    alert(result);
                    targetLI.remove();
                }
            })
        })

        function checkExtension(fileName, fileSize) {

            if(fileSize >= maxSize) {
                alert("파일 사이즈 초과");
                return false;
            }

            if(!regex.test(fileName)) {
                alert("해당 종류의 파일은 업로드 할 수 없습니다.");
                return false;
            }
            return true;
        }

        function showUploadResult(uploadResult) {

            if(!uploadResult) {
                return;
            }

            let uploadUL = $('.uploadResult ul');

            let str = "";

            $(uploadResult).each(function(i, obj) {

                if(obj.image) {
                    let fileCallPath = encodeURIComponent(obj.uploadPath+"/s_"+obj.uuid+"_"+obj.fileName);
                    str += "<li data-path='"+obj.uploadPath+"'";
                    str += "data-uuid='"+obj.uuid+"' data-filename='"+obj.fileName+"'data-type='"+obj.image+"'";
                    str += "><div>";
                    //str += "<span> "+obj.fileName+"</span>";
                    str += "<img src='/display?fileName="+fileCallPath+"'>";
                    str += "<button type='button' class='btn btn-dark btn-circle' data-file=\'"+fileCallPath+"\' data-type='image'>X</button>";
                    str += "</div>";
                    str += "</li>";
                } else {
                    return;
                }
            })

            uploadUL.html(str);
        }

    })
</script>


<!-- 시/군/구를 시/도에 맞게 변경-->
<script>
    $(document).ready(function() {
        $('#sido').on("change", function() {
            let options = $('#sigungu option');

            for(let i=1; i<options.length; i++) {
                options[i].setAttribute("hidden", "hidden");
            }

            if($('#sido option:selected').val() == "LODO01") {
                // 서울특별시일때
                for(let i=0; i<options.length; i++) {
                    if(options[i].value.substr(0,4) == "LOGU") {
                        options[i].removeAttribute("hidden");
                    }
                }
            }
            /*
            else if($('#sido option:selected').val() == "LODO02") {
                // 경기도일때
                for(let i=0; i<options.length; i++) {
                    if(options[i].value.substr(0,4) == "LOSI") {
                        options[i].removeAttribute("hidden");
                    }
                }
            }
            */
        })
    })
</script>
<script>
    // Add the following code if you want the name of the file appear on select
    $(".custom-file-input").on("change", function() {
        var fileName = $(this).val().split("\\").pop();
        $(this).siblings(".custom-file-label").addClass("selected").html(fileName);
    });
</script>




<%@include file="../includes/footer.jsp" %>
