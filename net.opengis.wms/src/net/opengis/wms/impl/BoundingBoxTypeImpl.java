/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.wms.impl;

import net.opengis.wms.BoundingBoxType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.BoundingBoxTypeImpl#getCRS <em>CRS</em>}</li>
 *   <li>{@link net.opengis.wms.impl.BoundingBoxTypeImpl#getMaxx <em>Maxx</em>}</li>
 *   <li>{@link net.opengis.wms.impl.BoundingBoxTypeImpl#getMaxy <em>Maxy</em>}</li>
 *   <li>{@link net.opengis.wms.impl.BoundingBoxTypeImpl#getMinx <em>Minx</em>}</li>
 *   <li>{@link net.opengis.wms.impl.BoundingBoxTypeImpl#getMiny <em>Miny</em>}</li>
 *   <li>{@link net.opengis.wms.impl.BoundingBoxTypeImpl#getResx <em>Resx</em>}</li>
 *   <li>{@link net.opengis.wms.impl.BoundingBoxTypeImpl#getResy <em>Resy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundingBoxTypeImpl extends MinimalEObjectImpl.Container implements BoundingBoxType {
	/**
	 * The default value of the '{@link #getCRS() <em>CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRS()
	 * @generated
	 * @ordered
	 */
	protected static final String CRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCRS() <em>CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRS()
	 * @generated
	 * @ordered
	 */
	protected String cRS = CRS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxx() <em>Maxx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxx()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxx() <em>Maxx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxx()
	 * @generated
	 * @ordered
	 */
	protected double maxx = MAXX_EDEFAULT;

	/**
	 * This is true if the Maxx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxxESet;

	/**
	 * The default value of the '{@link #getMaxy() <em>Maxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxy()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxy() <em>Maxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxy()
	 * @generated
	 * @ordered
	 */
	protected double maxy = MAXY_EDEFAULT;

	/**
	 * This is true if the Maxy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxyESet;

	/**
	 * The default value of the '{@link #getMinx() <em>Minx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinx()
	 * @generated
	 * @ordered
	 */
	protected static final double MINX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinx() <em>Minx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinx()
	 * @generated
	 * @ordered
	 */
	protected double minx = MINX_EDEFAULT;

	/**
	 * This is true if the Minx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minxESet;

	/**
	 * The default value of the '{@link #getMiny() <em>Miny</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiny()
	 * @generated
	 * @ordered
	 */
	protected static final double MINY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMiny() <em>Miny</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiny()
	 * @generated
	 * @ordered
	 */
	protected double miny = MINY_EDEFAULT;

	/**
	 * This is true if the Miny attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minyESet;

	/**
	 * The default value of the '{@link #getResx() <em>Resx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResx()
	 * @generated
	 * @ordered
	 */
	protected static final double RESX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResx() <em>Resx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResx()
	 * @generated
	 * @ordered
	 */
	protected double resx = RESX_EDEFAULT;

	/**
	 * This is true if the Resx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resxESet;

	/**
	 * The default value of the '{@link #getResy() <em>Resy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResy()
	 * @generated
	 * @ordered
	 */
	protected static final double RESY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResy() <em>Resy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResy()
	 * @generated
	 * @ordered
	 */
	protected double resy = RESY_EDEFAULT;

	/**
	 * This is true if the Resy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundingBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.BOUNDING_BOX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCRS() {
		return cRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCRS(String newCRS) {
		String oldCRS = cRS;
		cRS = newCRS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.BOUNDING_BOX_TYPE__CRS, oldCRS, cRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxx() {
		return maxx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxx(double newMaxx) {
		double oldMaxx = maxx;
		maxx = newMaxx;
		boolean oldMaxxESet = maxxESet;
		maxxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.BOUNDING_BOX_TYPE__MAXX, oldMaxx, maxx, !oldMaxxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxx() {
		double oldMaxx = maxx;
		boolean oldMaxxESet = maxxESet;
		maxx = MAXX_EDEFAULT;
		maxxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.BOUNDING_BOX_TYPE__MAXX, oldMaxx, MAXX_EDEFAULT, oldMaxxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxx() {
		return maxxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxy() {
		return maxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxy(double newMaxy) {
		double oldMaxy = maxy;
		maxy = newMaxy;
		boolean oldMaxyESet = maxyESet;
		maxyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.BOUNDING_BOX_TYPE__MAXY, oldMaxy, maxy, !oldMaxyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxy() {
		double oldMaxy = maxy;
		boolean oldMaxyESet = maxyESet;
		maxy = MAXY_EDEFAULT;
		maxyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.BOUNDING_BOX_TYPE__MAXY, oldMaxy, MAXY_EDEFAULT, oldMaxyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxy() {
		return maxyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinx() {
		return minx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinx(double newMinx) {
		double oldMinx = minx;
		minx = newMinx;
		boolean oldMinxESet = minxESet;
		minxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.BOUNDING_BOX_TYPE__MINX, oldMinx, minx, !oldMinxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinx() {
		double oldMinx = minx;
		boolean oldMinxESet = minxESet;
		minx = MINX_EDEFAULT;
		minxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.BOUNDING_BOX_TYPE__MINX, oldMinx, MINX_EDEFAULT, oldMinxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinx() {
		return minxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMiny() {
		return miny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiny(double newMiny) {
		double oldMiny = miny;
		miny = newMiny;
		boolean oldMinyESet = minyESet;
		minyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.BOUNDING_BOX_TYPE__MINY, oldMiny, miny, !oldMinyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMiny() {
		double oldMiny = miny;
		boolean oldMinyESet = minyESet;
		miny = MINY_EDEFAULT;
		minyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.BOUNDING_BOX_TYPE__MINY, oldMiny, MINY_EDEFAULT, oldMinyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMiny() {
		return minyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getResx() {
		return resx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResx(double newResx) {
		double oldResx = resx;
		resx = newResx;
		boolean oldResxESet = resxESet;
		resxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.BOUNDING_BOX_TYPE__RESX, oldResx, resx, !oldResxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetResx() {
		double oldResx = resx;
		boolean oldResxESet = resxESet;
		resx = RESX_EDEFAULT;
		resxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.BOUNDING_BOX_TYPE__RESX, oldResx, RESX_EDEFAULT, oldResxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetResx() {
		return resxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getResy() {
		return resy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResy(double newResy) {
		double oldResy = resy;
		resy = newResy;
		boolean oldResyESet = resyESet;
		resyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.BOUNDING_BOX_TYPE__RESY, oldResy, resy, !oldResyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetResy() {
		double oldResy = resy;
		boolean oldResyESet = resyESet;
		resy = RESY_EDEFAULT;
		resyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.BOUNDING_BOX_TYPE__RESY, oldResy, RESY_EDEFAULT, oldResyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetResy() {
		return resyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WMSPackage.BOUNDING_BOX_TYPE__CRS:
				return getCRS();
			case WMSPackage.BOUNDING_BOX_TYPE__MAXX:
				return getMaxx();
			case WMSPackage.BOUNDING_BOX_TYPE__MAXY:
				return getMaxy();
			case WMSPackage.BOUNDING_BOX_TYPE__MINX:
				return getMinx();
			case WMSPackage.BOUNDING_BOX_TYPE__MINY:
				return getMiny();
			case WMSPackage.BOUNDING_BOX_TYPE__RESX:
				return getResx();
			case WMSPackage.BOUNDING_BOX_TYPE__RESY:
				return getResy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WMSPackage.BOUNDING_BOX_TYPE__CRS:
				setCRS((String)newValue);
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__MAXX:
				setMaxx((Double)newValue);
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__MAXY:
				setMaxy((Double)newValue);
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__MINX:
				setMinx((Double)newValue);
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__MINY:
				setMiny((Double)newValue);
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__RESX:
				setResx((Double)newValue);
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__RESY:
				setResy((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WMSPackage.BOUNDING_BOX_TYPE__CRS:
				setCRS(CRS_EDEFAULT);
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__MAXX:
				unsetMaxx();
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__MAXY:
				unsetMaxy();
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__MINX:
				unsetMinx();
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__MINY:
				unsetMiny();
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__RESX:
				unsetResx();
				return;
			case WMSPackage.BOUNDING_BOX_TYPE__RESY:
				unsetResy();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WMSPackage.BOUNDING_BOX_TYPE__CRS:
				return CRS_EDEFAULT == null ? cRS != null : !CRS_EDEFAULT.equals(cRS);
			case WMSPackage.BOUNDING_BOX_TYPE__MAXX:
				return isSetMaxx();
			case WMSPackage.BOUNDING_BOX_TYPE__MAXY:
				return isSetMaxy();
			case WMSPackage.BOUNDING_BOX_TYPE__MINX:
				return isSetMinx();
			case WMSPackage.BOUNDING_BOX_TYPE__MINY:
				return isSetMiny();
			case WMSPackage.BOUNDING_BOX_TYPE__RESX:
				return isSetResx();
			case WMSPackage.BOUNDING_BOX_TYPE__RESY:
				return isSetResy();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cRS: ");
		result.append(cRS);
		result.append(", maxx: ");
		if (maxxESet) result.append(maxx); else result.append("<unset>");
		result.append(", maxy: ");
		if (maxyESet) result.append(maxy); else result.append("<unset>");
		result.append(", minx: ");
		if (minxESet) result.append(minx); else result.append("<unset>");
		result.append(", miny: ");
		if (minyESet) result.append(miny); else result.append("<unset>");
		result.append(", resx: ");
		if (resxESet) result.append(resx); else result.append("<unset>");
		result.append(", resy: ");
		if (resyESet) result.append(resy); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BoundingBoxTypeImpl
