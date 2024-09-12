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

import net.opengis.kml.KMLPackage;
import net.opengis.kml.SimpleFieldType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.SimpleFieldTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SimpleFieldTypeImpl#getSimpleFieldExtensionGroup <em>Simple Field Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SimpleFieldTypeImpl#getSimpleFieldExtension <em>Simple Field Extension</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SimpleFieldTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SimpleFieldTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleFieldTypeImpl extends MinimalEObjectImpl.Container implements SimpleFieldType {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimpleFieldExtensionGroup() <em>Simple Field Extension Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleFieldExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap simpleFieldExtensionGroup;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleFieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getSimpleFieldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SIMPLE_FIELD_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSimpleFieldExtensionGroup() {
		if (simpleFieldExtensionGroup == null) {
			simpleFieldExtensionGroup = new BasicFeatureMap(this, KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION_GROUP);
		}
		return simpleFieldExtensionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getSimpleFieldExtension() {
		return getSimpleFieldExtensionGroup().list(KMLPackage.eINSTANCE.getSimpleFieldType_SimpleFieldExtension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SIMPLE_FIELD_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SIMPLE_FIELD_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION_GROUP:
				return ((InternalEList<?>)getSimpleFieldExtensionGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION:
				return ((InternalEList<?>)getSimpleFieldExtension()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.SIMPLE_FIELD_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION_GROUP:
				if (coreType) return getSimpleFieldExtensionGroup();
				return ((FeatureMap.Internal)getSimpleFieldExtensionGroup()).getWrapper();
			case KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION:
				return getSimpleFieldExtension();
			case KMLPackage.SIMPLE_FIELD_TYPE__NAME:
				return getName();
			case KMLPackage.SIMPLE_FIELD_TYPE__TYPE:
				return getType();
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
			case KMLPackage.SIMPLE_FIELD_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION_GROUP:
				((FeatureMap.Internal)getSimpleFieldExtensionGroup()).set(newValue);
				return;
			case KMLPackage.SIMPLE_FIELD_TYPE__NAME:
				setName((String)newValue);
				return;
			case KMLPackage.SIMPLE_FIELD_TYPE__TYPE:
				setType((String)newValue);
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
			case KMLPackage.SIMPLE_FIELD_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION_GROUP:
				getSimpleFieldExtensionGroup().clear();
				return;
			case KMLPackage.SIMPLE_FIELD_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KMLPackage.SIMPLE_FIELD_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case KMLPackage.SIMPLE_FIELD_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION_GROUP:
				return simpleFieldExtensionGroup != null && !simpleFieldExtensionGroup.isEmpty();
			case KMLPackage.SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION:
				return !getSimpleFieldExtension().isEmpty();
			case KMLPackage.SIMPLE_FIELD_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KMLPackage.SIMPLE_FIELD_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", simpleFieldExtensionGroup: ");
		result.append(simpleFieldExtensionGroup);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SimpleFieldTypeImpl
