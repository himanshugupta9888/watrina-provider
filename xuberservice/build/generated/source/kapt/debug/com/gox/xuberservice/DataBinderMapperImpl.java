package com.gox.xuberservice;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.gox.xuberservice.databinding.ActivityXuberMainBindingImpl;
import com.gox.xuberservice.databinding.BottomServiceStatusSheetBindingImpl;
import com.gox.xuberservice.databinding.DialogInvoiceBindingImpl;
import com.gox.xuberservice.databinding.DialogReasonBindingImpl;
import com.gox.xuberservice.databinding.DialogUploadImageBindingImpl;
import com.gox.xuberservice.databinding.DialogXuperExtraChargeBindingImpl;
import com.gox.xuberservice.databinding.DialogXuperRatingBindingImpl;
import com.gox.xuberservice.databinding.ItemXuberReasonBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYXUBERMAIN = 1;

  private static final int LAYOUT_BOTTOMSERVICESTATUSSHEET = 2;

  private static final int LAYOUT_DIALOGINVOICE = 3;

  private static final int LAYOUT_DIALOGREASON = 4;

  private static final int LAYOUT_DIALOGUPLOADIMAGE = 5;

  private static final int LAYOUT_DIALOGXUPEREXTRACHARGE = 6;

  private static final int LAYOUT_DIALOGXUPERRATING = 7;

  private static final int LAYOUT_ITEMXUBERREASON = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gox.xuberservice.R.layout.activity_xuber_main, LAYOUT_ACTIVITYXUBERMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gox.xuberservice.R.layout.bottom_service_status_sheet, LAYOUT_BOTTOMSERVICESTATUSSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gox.xuberservice.R.layout.dialog_invoice, LAYOUT_DIALOGINVOICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gox.xuberservice.R.layout.dialog_reason, LAYOUT_DIALOGREASON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gox.xuberservice.R.layout.dialog_upload_image, LAYOUT_DIALOGUPLOADIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gox.xuberservice.R.layout.dialog_xuper_extra_charge, LAYOUT_DIALOGXUPEREXTRACHARGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gox.xuberservice.R.layout.dialog_xuper_rating, LAYOUT_DIALOGXUPERRATING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gox.xuberservice.R.layout.item_xuber_reason, LAYOUT_ITEMXUBERREASON);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYXUBERMAIN: {
          if ("layout/activity_xuber_main_0".equals(tag)) {
            return new ActivityXuberMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_xuber_main is invalid. Received: " + tag);
        }
        case  LAYOUT_BOTTOMSERVICESTATUSSHEET: {
          if ("layout/bottom_service_status_sheet_0".equals(tag)) {
            return new BottomServiceStatusSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_service_status_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGINVOICE: {
          if ("layout/dialog_invoice_0".equals(tag)) {
            return new DialogInvoiceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_invoice is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGREASON: {
          if ("layout/dialog_reason_0".equals(tag)) {
            return new DialogReasonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_reason is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGUPLOADIMAGE: {
          if ("layout/dialog_upload_image_0".equals(tag)) {
            return new DialogUploadImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_upload_image is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGXUPEREXTRACHARGE: {
          if ("layout/dialog_xuper_extra_charge_0".equals(tag)) {
            return new DialogXuperExtraChargeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_xuper_extra_charge is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGXUPERRATING: {
          if ("layout/dialog_xuper_rating_0".equals(tag)) {
            return new DialogXuperRatingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_xuper_rating is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMXUBERREASON: {
          if ("layout/item_xuber_reason_0".equals(tag)) {
            return new ItemXuberReasonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_xuber_reason is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.gox.base.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "bottomServiceModel");
      sKeys.put(2, "chatAdapter");
      sKeys.put(3, "extraChargeModel");
      sKeys.put(4, "invoicemodel");
      sKeys.put(5, "ratingmodel");
      sKeys.put(6, "reasonadapter");
      sKeys.put(7, "uploadImageModel");
      sKeys.put(8, "viewmodel");
      sKeys.put(9, "xuberViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_xuber_main_0", com.gox.xuberservice.R.layout.activity_xuber_main);
      sKeys.put("layout/bottom_service_status_sheet_0", com.gox.xuberservice.R.layout.bottom_service_status_sheet);
      sKeys.put("layout/dialog_invoice_0", com.gox.xuberservice.R.layout.dialog_invoice);
      sKeys.put("layout/dialog_reason_0", com.gox.xuberservice.R.layout.dialog_reason);
      sKeys.put("layout/dialog_upload_image_0", com.gox.xuberservice.R.layout.dialog_upload_image);
      sKeys.put("layout/dialog_xuper_extra_charge_0", com.gox.xuberservice.R.layout.dialog_xuper_extra_charge);
      sKeys.put("layout/dialog_xuper_rating_0", com.gox.xuberservice.R.layout.dialog_xuper_rating);
      sKeys.put("layout/item_xuber_reason_0", com.gox.xuberservice.R.layout.item_xuber_reason);
    }
  }
}
