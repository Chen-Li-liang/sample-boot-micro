package sample.controller.admin;

import static sample.microasset.api.admin.AssetAdminFacade.*;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sample.controller.ControllerSupport;
import sample.microasset.api.admin.AssetAdminFacade;
import sample.microasset.model.asset.CashInOut;
import sample.microasset.model.asset.CashInOut.FindCashInOut;

/**
 * 資産に関わる社内のUI要求を処理します。
 */
@RestController
@RequestMapping(Path)
public class AssetAdminController extends ControllerSupport {

    @Autowired
    AssetAdminFacade facade;

    /** 未処理の振込依頼情報を検索します。 */
    @RequestMapping(PathFindCashInOut)
    public List<CashInOut> findCashInOut(@Valid FindCashInOut p) {
        return facade.findCashInOut(p);
    }

}
