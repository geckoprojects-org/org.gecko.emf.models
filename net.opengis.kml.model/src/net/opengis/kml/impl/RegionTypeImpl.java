/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.LatLonAltBoxType;
import net.opengis.kml.LodType;
import net.opengis.kml.RegionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.RegionTypeImpl#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link net.opengis.kml.impl.RegionTypeImpl#getLod <em>Lod</em>}</li>
 *   <li>{@link net.opengis.kml.impl.RegionTypeImpl#getRegionSimpleExtensionGroupGroup <em>Region Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.RegionTypeImpl#getRegionSimpleExtensionGroup <em>Region Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.RegionTypeImpl#getRegionObjectExtensionGroupGroup <em>Region Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.RegionTypeImpl#getRegionObjectExtensionGroup <em>Region Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionTypeImpl extends AbstractObjectTypeImpl implements RegionType {
	/**
	 * The cached value of the '{@link #getLatLonAltBox() <em>Lat Lon Alt Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonAltBox()
	 * @generated
	 * @ordered
	 */
	protected LatLonAltBoxType latLonAltBox;

	/**
	 * The cached value of the '{@link #getLod() <em>Lod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod()
	 * @generated
	 * @ordered
	 */
	protected LodType lod;

	/**
	 * The cached value of the '{@link #getRegionSimpleExtensionGroupGroup() <em>Region Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap regionSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getRegionObjectExtensionGroupGroup() <em>Region Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap regionObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getRegionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatLonAltBoxType getLatLonAltBox() {
		return latLonAltBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonAltBox(LatLonAltBoxType newLatLonAltBox, NotificationChain msgs) {
		LatLonAltBoxType oldLatLonAltBox = latLonAltBox;
		latLonAltBox = newLatLonAltBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX, oldLatLonAltBox, newLatLonAltBox);
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
	public void setLatLonAltBox(LatLonAltBoxType newLatLonAltBox) {
		if (newLatLonAltBox != latLonAltBox) {
			NotificationChain msgs = null;
			if (latLonAltBox != null)
				msgs = ((InternalEObject)latLonAltBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX, null, msgs);
			if (newLatLonAltBox != null)
				msgs = ((InternalEObject)newLatLonAltBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX, null, msgs);
			msgs = basicSetLatLonAltBox(newLatLonAltBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX, newLatLonAltBox, newLatLonAltBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LodType getLod() {
		return lod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod(LodType newLod, NotificationChain msgs) {
		LodType oldLod = lod;
		lod = newLod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.REGION_TYPE__LOD, oldLod, newLod);
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
	public void setLod(LodType newLod) {
		if (newLod != lod) {
			NotificationChain msgs = null;
			if (lod != null)
				msgs = ((InternalEObject)lod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.REGION_TYPE__LOD, null, msgs);
			if (newLod != null)
				msgs = ((InternalEObject)newLod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.REGION_TYPE__LOD, null, msgs);
			msgs = basicSetLod(newLod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.REGION_TYPE__LOD, newLod, newLod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getRegionSimpleExtensionGroupGroup() {
		if (regionSimpleExtensionGroupGroup == null) {
			regionSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return regionSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getRegionSimpleExtensionGroup() {
		return getRegionSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getRegionType_RegionSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getRegionObjectExtensionGroupGroup() {
		if (regionObjectExtensionGroupGroup == null) {
			regionObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return regionObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getRegionObjectExtensionGroup() {
		return getRegionObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getRegionType_RegionObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX:
				return basicSetLatLonAltBox(null, msgs);
			case KMLPackage.REGION_TYPE__LOD:
				return basicSetLod(null, msgs);
			case KMLPackage.REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getRegionSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getRegionObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getRegionObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX:
				return getLatLonAltBox();
			case KMLPackage.REGION_TYPE__LOD:
				return getLod();
			case KMLPackage.REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getRegionSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getRegionSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP:
				return getRegionSimpleExtensionGroup();
			case KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getRegionObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getRegionObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP:
				return getRegionObjectExtensionGroup();
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
			case KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBoxType)newValue);
				return;
			case KMLPackage.REGION_TYPE__LOD:
				setLod((LodType)newValue);
				return;
			case KMLPackage.REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getRegionSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getRegionObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBoxType)null);
				return;
			case KMLPackage.REGION_TYPE__LOD:
				setLod((LodType)null);
				return;
			case KMLPackage.REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP_GROUP:
				getRegionSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP_GROUP:
				getRegionObjectExtensionGroupGroup().clear();
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
			case KMLPackage.REGION_TYPE__LAT_LON_ALT_BOX:
				return latLonAltBox != null;
			case KMLPackage.REGION_TYPE__LOD:
				return lod != null;
			case KMLPackage.REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP_GROUP:
				return regionSimpleExtensionGroupGroup != null && !regionSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP:
				return !getRegionSimpleExtensionGroup().isEmpty();
			case KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP_GROUP:
				return regionObjectExtensionGroupGroup != null && !regionObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP:
				return !getRegionObjectExtensionGroup().isEmpty();
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
		result.append(" (regionSimpleExtensionGroupGroup: ");
		result.append(regionSimpleExtensionGroupGroup);
		result.append(", regionObjectExtensionGroupGroup: ");
		result.append(regionObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //RegionTypeImpl
