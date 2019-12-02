package com.bawei.lxs12022.contract;

import com.bawei.lxs12022.model.bean.Bean;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  16:30
 * 类名：com.bawei.lxs12022.contract
 */

public interface Mycontract {
    interface IView{
        void onMySuccess(Bean bean);
        void onMyFailure(Throwable throwable);
    }
    interface IModelCallBack{
        void onMySuccess(Bean bean);
        void onMyFailure(Throwable throwable);
    }
}
