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

import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.KmlType;
import net.opengis.kml.NetworkLinkControlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kml Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.KmlTypeImpl#getNetworkLinkControl <em>Network Link Control</em>}</li>
 *   <li>{@link net.opengis.kml.impl.KmlTypeImpl#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.KmlTypeImpl#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.KmlTypeImpl#getKmlSimpleExtensionGroupGroup <em>Kml Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.KmlTypeImpl#getKmlSimpleExtensionGroup <em>Kml Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.KmlTypeImpl#getKmlObjectExtensionGroupGroup <em>Kml Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.KmlTypeImpl#getKmlObjectExtensionGroup <em>Kml Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.KmlTypeImpl#getHint <em>Hint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KmlTypeImpl extends MinimalEObjectImpl.Container implements KmlType {
	/**
	 * The cached value of the '{@link #getNetworkLinkControl() <em>Network Link Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkLinkControl()
	 * @generated
	 * @ordered
	 */
	protected NetworkLinkControlType networkLinkControl;

	/**
	 * The cached value of the '{@link #getAbstractFeatureGroupGroup() <em>Abstract Feature Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFeatureGroupGroup;

	/**
	 * The cached value of the '{@link #getKmlSimpleExtensionGroupGroup() <em>Kml Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmlSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap kmlSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getKmlObjectExtensionGroupGroup() <em>Kml Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmlObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap kmlObjectExtensionGroupGroup;

	/**
	 * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected static final String HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected String hint = HINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KmlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getKmlType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLinkControlType getNetworkLinkControl() {
		return networkLinkControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkLinkControl(NetworkLinkControlType newNetworkLinkControl, NotificationChain msgs) {
		NetworkLinkControlType oldNetworkLinkControl = networkLinkControl;
		networkLinkControl = newNetworkLinkControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL, oldNetworkLinkControl, newNetworkLinkControl);
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
	public void setNetworkLinkControl(NetworkLinkControlType newNetworkLinkControl) {
		if (newNetworkLinkControl != networkLinkControl) {
			NotificationChain msgs = null;
			if (networkLinkControl != null)
				msgs = ((InternalEObject)networkLinkControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL, null, msgs);
			if (newNetworkLinkControl != null)
				msgs = ((InternalEObject)newNetworkLinkControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL, null, msgs);
			msgs = basicSetNetworkLinkControl(newNetworkLinkControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL, newNetworkLinkControl, newNetworkLinkControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractFeatureGroupGroup() {
		if (abstractFeatureGroupGroup == null) {
			abstractFeatureGroupGroup = new BasicFeatureMap(this, KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP_GROUP);
		}
		return abstractFeatureGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFeatureType getAbstractFeatureGroup() {
		return (AbstractFeatureType)getAbstractFeatureGroupGroup().get(KMLPackage.eINSTANCE.getKmlType_AbstractFeatureGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFeatureGroup(AbstractFeatureType newAbstractFeatureGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractFeatureGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getKmlType_AbstractFeatureGroup(), newAbstractFeatureGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getKmlSimpleExtensionGroupGroup() {
		if (kmlSimpleExtensionGroupGroup == null) {
			kmlSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.KML_TYPE__KML_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return kmlSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getKmlSimpleExtensionGroup() {
		return getKmlSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getKmlType_KmlSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getKmlObjectExtensionGroupGroup() {
		if (kmlObjectExtensionGroupGroup == null) {
			kmlObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return kmlObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getKmlObjectExtensionGroup() {
		return getKmlObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getKmlType_KmlObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHint(String newHint) {
		String oldHint = hint;
		hint = newHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.KML_TYPE__HINT, oldHint, hint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL:
				return basicSetNetworkLinkControl(null, msgs);
			case KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP:
				return basicSetAbstractFeatureGroup(null, msgs);
			case KMLPackage.KML_TYPE__KML_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getKmlSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getKmlObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getKmlObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL:
				return getNetworkLinkControl();
			case KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				if (coreType) return getAbstractFeatureGroupGroup();
				return ((FeatureMap.Internal)getAbstractFeatureGroupGroup()).getWrapper();
			case KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP:
				return getAbstractFeatureGroup();
			case KMLPackage.KML_TYPE__KML_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getKmlSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getKmlSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.KML_TYPE__KML_SIMPLE_EXTENSION_GROUP:
				return getKmlSimpleExtensionGroup();
			case KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getKmlObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getKmlObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP:
				return getKmlObjectExtensionGroup();
			case KMLPackage.KML_TYPE__HINT:
				return getHint();
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
			case KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL:
				setNetworkLinkControl((NetworkLinkControlType)newValue);
				return;
			case KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractFeatureGroupGroup()).set(newValue);
				return;
			case KMLPackage.KML_TYPE__KML_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getKmlSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getKmlObjectExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.KML_TYPE__HINT:
				setHint((String)newValue);
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
			case KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL:
				setNetworkLinkControl((NetworkLinkControlType)null);
				return;
			case KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				getAbstractFeatureGroupGroup().clear();
				return;
			case KMLPackage.KML_TYPE__KML_SIMPLE_EXTENSION_GROUP_GROUP:
				getKmlSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP_GROUP:
				getKmlObjectExtensionGroupGroup().clear();
				return;
			case KMLPackage.KML_TYPE__HINT:
				setHint(HINT_EDEFAULT);
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
			case KMLPackage.KML_TYPE__NETWORK_LINK_CONTROL:
				return networkLinkControl != null;
			case KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				return abstractFeatureGroupGroup != null && !abstractFeatureGroupGroup.isEmpty();
			case KMLPackage.KML_TYPE__ABSTRACT_FEATURE_GROUP:
				return getAbstractFeatureGroup() != null;
			case KMLPackage.KML_TYPE__KML_SIMPLE_EXTENSION_GROUP_GROUP:
				return kmlSimpleExtensionGroupGroup != null && !kmlSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.KML_TYPE__KML_SIMPLE_EXTENSION_GROUP:
				return !getKmlSimpleExtensionGroup().isEmpty();
			case KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP_GROUP:
				return kmlObjectExtensionGroupGroup != null && !kmlObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.KML_TYPE__KML_OBJECT_EXTENSION_GROUP:
				return !getKmlObjectExtensionGroup().isEmpty();
			case KMLPackage.KML_TYPE__HINT:
				return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
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
		result.append(" (abstractFeatureGroupGroup: ");
		result.append(abstractFeatureGroupGroup);
		result.append(", kmlSimpleExtensionGroupGroup: ");
		result.append(kmlSimpleExtensionGroupGroup);
		result.append(", kmlObjectExtensionGroupGroup: ");
		result.append(kmlObjectExtensionGroupGroup);
		result.append(", hint: ");
		result.append(hint);
		result.append(')');
		return result.toString();
	}

} //KmlTypeImpl
