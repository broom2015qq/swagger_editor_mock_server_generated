/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T08:07:53.770Z")

@Api(value = "hello", description = "the hello API")
public interface HelloApi {

    @ApiOperation(value = "查询个人信息接口", nickname = "sayUsingGET", notes = "查询个人信息接口", response = User.class, tags={ "user-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/hello",
        produces = { "*/*" }, 
//        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<User> sayUsingGET(@NotNull @ApiParam(value = "id", required = true) @Valid @RequestParam(value = "id", required = true) Integer id);

}
