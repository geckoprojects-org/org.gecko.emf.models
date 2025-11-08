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
package org.cyclonedx.schema.bom.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.AltIdsType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.LicenseTypesType;
import org.cyclonedx.schema.bom.LicenseeType;
import org.cyclonedx.schema.bom.LicensingType;
import org.cyclonedx.schema.bom.LicensorType;
import org.cyclonedx.schema.bom.PurchaserType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Licensing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getAltIds <em>Alt Ids</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getLicensor <em>Licensor</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getLicensee <em>Licensee</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getPurchaser <em>Purchaser</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getPurchaseOrder <em>Purchase Order</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getLicenseTypes <em>License Types</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getLastRenewal <em>Last Renewal</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getExpiration <em>Expiration</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicensingTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicensingTypeImpl extends MinimalEObjectImpl.Container implements LicensingType {
	/**
	 * The cached value of the '{@link #getAltIds() <em>Alt Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltIds()
	 * @generated
	 * @ordered
	 */
	protected AltIdsType altIds;

	/**
	 * The cached value of the '{@link #getLicensor() <em>Licensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensor()
	 * @generated
	 * @ordered
	 */
	protected LicensorType licensor;

	/**
	 * The cached value of the '{@link #getLicensee() <em>Licensee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensee()
	 * @generated
	 * @ordered
	 */
	protected LicenseeType licensee;

	/**
	 * The cached value of the '{@link #getPurchaser() <em>Purchaser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaser()
	 * @generated
	 * @ordered
	 */
	protected PurchaserType purchaser;

	/**
	 * The default value of the '{@link #getPurchaseOrder() <em>Purchase Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCHASE_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseOrder() <em>Purchase Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrder()
	 * @generated
	 * @ordered
	 */
	protected String purchaseOrder = PURCHASE_ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLicenseTypes() <em>License Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseTypes()
	 * @generated
	 * @ordered
	 */
	protected LicenseTypesType licenseTypes;

	/**
	 * The default value of the '{@link #getLastRenewal() <em>Last Renewal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRenewal()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_RENEWAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRenewal() <em>Last Renewal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRenewal()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastRenewal = LAST_RENEWAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expiration = EXPIRATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicensingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getLicensingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltIdsType getAltIds() {
		return altIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltIds(AltIdsType newAltIds, NotificationChain msgs) {
		AltIdsType oldAltIds = altIds;
		altIds = newAltIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__ALT_IDS, oldAltIds, newAltIds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltIds(AltIdsType newAltIds) {
		if (newAltIds != altIds) {
			NotificationChain msgs = null;
			if (altIds != null)
				msgs = ((InternalEObject)altIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__ALT_IDS, null, msgs);
			if (newAltIds != null)
				msgs = ((InternalEObject)newAltIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__ALT_IDS, null, msgs);
			msgs = basicSetAltIds(newAltIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__ALT_IDS, newAltIds, newAltIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicensorType getLicensor() {
		return licensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicensor(LicensorType newLicensor, NotificationChain msgs) {
		LicensorType oldLicensor = licensor;
		licensor = newLicensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__LICENSOR, oldLicensor, newLicensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicensor(LicensorType newLicensor) {
		if (newLicensor != licensor) {
			NotificationChain msgs = null;
			if (licensor != null)
				msgs = ((InternalEObject)licensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__LICENSOR, null, msgs);
			if (newLicensor != null)
				msgs = ((InternalEObject)newLicensor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__LICENSOR, null, msgs);
			msgs = basicSetLicensor(newLicensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__LICENSOR, newLicensor, newLicensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseeType getLicensee() {
		return licensee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicensee(LicenseeType newLicensee, NotificationChain msgs) {
		LicenseeType oldLicensee = licensee;
		licensee = newLicensee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__LICENSEE, oldLicensee, newLicensee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicensee(LicenseeType newLicensee) {
		if (newLicensee != licensee) {
			NotificationChain msgs = null;
			if (licensee != null)
				msgs = ((InternalEObject)licensee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__LICENSEE, null, msgs);
			if (newLicensee != null)
				msgs = ((InternalEObject)newLicensee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__LICENSEE, null, msgs);
			msgs = basicSetLicensee(newLicensee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__LICENSEE, newLicensee, newLicensee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PurchaserType getPurchaser() {
		return purchaser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurchaser(PurchaserType newPurchaser, NotificationChain msgs) {
		PurchaserType oldPurchaser = purchaser;
		purchaser = newPurchaser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__PURCHASER, oldPurchaser, newPurchaser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaser(PurchaserType newPurchaser) {
		if (newPurchaser != purchaser) {
			NotificationChain msgs = null;
			if (purchaser != null)
				msgs = ((InternalEObject)purchaser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__PURCHASER, null, msgs);
			if (newPurchaser != null)
				msgs = ((InternalEObject)newPurchaser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__PURCHASER, null, msgs);
			msgs = basicSetPurchaser(newPurchaser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__PURCHASER, newPurchaser, newPurchaser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurchaseOrder() {
		return purchaseOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseOrder(String newPurchaseOrder) {
		String oldPurchaseOrder = purchaseOrder;
		purchaseOrder = newPurchaseOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__PURCHASE_ORDER, oldPurchaseOrder, purchaseOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseTypesType getLicenseTypes() {
		return licenseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenseTypes(LicenseTypesType newLicenseTypes, NotificationChain msgs) {
		LicenseTypesType oldLicenseTypes = licenseTypes;
		licenseTypes = newLicenseTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__LICENSE_TYPES, oldLicenseTypes, newLicenseTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicenseTypes(LicenseTypesType newLicenseTypes) {
		if (newLicenseTypes != licenseTypes) {
			NotificationChain msgs = null;
			if (licenseTypes != null)
				msgs = ((InternalEObject)licenseTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__LICENSE_TYPES, null, msgs);
			if (newLicenseTypes != null)
				msgs = ((InternalEObject)newLicenseTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSING_TYPE__LICENSE_TYPES, null, msgs);
			msgs = basicSetLicenseTypes(newLicenseTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__LICENSE_TYPES, newLicenseTypes, newLicenseTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLastRenewal() {
		return lastRenewal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastRenewal(XMLGregorianCalendar newLastRenewal) {
		XMLGregorianCalendar oldLastRenewal = lastRenewal;
		lastRenewal = newLastRenewal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__LAST_RENEWAL, oldLastRenewal, lastRenewal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getExpiration() {
		return expiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiration(XMLGregorianCalendar newExpiration) {
		XMLGregorianCalendar oldExpiration = expiration;
		expiration = newExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSING_TYPE__EXPIRATION, oldExpiration, expiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.LICENSING_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.LICENSING_TYPE__ALT_IDS:
				return basicSetAltIds(null, msgs);
			case BOMPackage.LICENSING_TYPE__LICENSOR:
				return basicSetLicensor(null, msgs);
			case BOMPackage.LICENSING_TYPE__LICENSEE:
				return basicSetLicensee(null, msgs);
			case BOMPackage.LICENSING_TYPE__PURCHASER:
				return basicSetPurchaser(null, msgs);
			case BOMPackage.LICENSING_TYPE__LICENSE_TYPES:
				return basicSetLicenseTypes(null, msgs);
			case BOMPackage.LICENSING_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.LICENSING_TYPE__ALT_IDS:
				return getAltIds();
			case BOMPackage.LICENSING_TYPE__LICENSOR:
				return getLicensor();
			case BOMPackage.LICENSING_TYPE__LICENSEE:
				return getLicensee();
			case BOMPackage.LICENSING_TYPE__PURCHASER:
				return getPurchaser();
			case BOMPackage.LICENSING_TYPE__PURCHASE_ORDER:
				return getPurchaseOrder();
			case BOMPackage.LICENSING_TYPE__LICENSE_TYPES:
				return getLicenseTypes();
			case BOMPackage.LICENSING_TYPE__LAST_RENEWAL:
				return getLastRenewal();
			case BOMPackage.LICENSING_TYPE__EXPIRATION:
				return getExpiration();
			case BOMPackage.LICENSING_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case BOMPackage.LICENSING_TYPE__ALT_IDS:
				setAltIds((AltIdsType)newValue);
				return;
			case BOMPackage.LICENSING_TYPE__LICENSOR:
				setLicensor((LicensorType)newValue);
				return;
			case BOMPackage.LICENSING_TYPE__LICENSEE:
				setLicensee((LicenseeType)newValue);
				return;
			case BOMPackage.LICENSING_TYPE__PURCHASER:
				setPurchaser((PurchaserType)newValue);
				return;
			case BOMPackage.LICENSING_TYPE__PURCHASE_ORDER:
				setPurchaseOrder((String)newValue);
				return;
			case BOMPackage.LICENSING_TYPE__LICENSE_TYPES:
				setLicenseTypes((LicenseTypesType)newValue);
				return;
			case BOMPackage.LICENSING_TYPE__LAST_RENEWAL:
				setLastRenewal((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.LICENSING_TYPE__EXPIRATION:
				setExpiration((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.LICENSING_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case BOMPackage.LICENSING_TYPE__ALT_IDS:
				setAltIds((AltIdsType)null);
				return;
			case BOMPackage.LICENSING_TYPE__LICENSOR:
				setLicensor((LicensorType)null);
				return;
			case BOMPackage.LICENSING_TYPE__LICENSEE:
				setLicensee((LicenseeType)null);
				return;
			case BOMPackage.LICENSING_TYPE__PURCHASER:
				setPurchaser((PurchaserType)null);
				return;
			case BOMPackage.LICENSING_TYPE__PURCHASE_ORDER:
				setPurchaseOrder(PURCHASE_ORDER_EDEFAULT);
				return;
			case BOMPackage.LICENSING_TYPE__LICENSE_TYPES:
				setLicenseTypes((LicenseTypesType)null);
				return;
			case BOMPackage.LICENSING_TYPE__LAST_RENEWAL:
				setLastRenewal(LAST_RENEWAL_EDEFAULT);
				return;
			case BOMPackage.LICENSING_TYPE__EXPIRATION:
				setExpiration(EXPIRATION_EDEFAULT);
				return;
			case BOMPackage.LICENSING_TYPE__ANY:
				getAny().clear();
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
			case BOMPackage.LICENSING_TYPE__ALT_IDS:
				return altIds != null;
			case BOMPackage.LICENSING_TYPE__LICENSOR:
				return licensor != null;
			case BOMPackage.LICENSING_TYPE__LICENSEE:
				return licensee != null;
			case BOMPackage.LICENSING_TYPE__PURCHASER:
				return purchaser != null;
			case BOMPackage.LICENSING_TYPE__PURCHASE_ORDER:
				return PURCHASE_ORDER_EDEFAULT == null ? purchaseOrder != null : !PURCHASE_ORDER_EDEFAULT.equals(purchaseOrder);
			case BOMPackage.LICENSING_TYPE__LICENSE_TYPES:
				return licenseTypes != null;
			case BOMPackage.LICENSING_TYPE__LAST_RENEWAL:
				return LAST_RENEWAL_EDEFAULT == null ? lastRenewal != null : !LAST_RENEWAL_EDEFAULT.equals(lastRenewal);
			case BOMPackage.LICENSING_TYPE__EXPIRATION:
				return EXPIRATION_EDEFAULT == null ? expiration != null : !EXPIRATION_EDEFAULT.equals(expiration);
			case BOMPackage.LICENSING_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (purchaseOrder: ");
		result.append(purchaseOrder);
		result.append(", lastRenewal: ");
		result.append(lastRenewal);
		result.append(", expiration: ");
		result.append(expiration);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //LicensingTypeImpl
