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

import java.util.Collection;

import net.opengis.kml.KMLPackage;
import net.opengis.kml.SchemaType;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.SchemaTypeImpl#getSimpleField <em>Simple Field</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SchemaTypeImpl#getSchemaExtensionGroup <em>Schema Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SchemaTypeImpl#getSchemaExtension <em>Schema Extension</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SchemaTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SchemaTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaTypeImpl extends MinimalEObjectImpl.Container implements SchemaType {
	/**
	 * The cached value of the '{@link #getSimpleField() <em>Simple Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleField()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleFieldType> simpleField;

	/**
	 * The cached value of the '{@link #getSchemaExtensionGroup() <em>Schema Extension Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap schemaExtensionGroup;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getSchemaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleFieldType> getSimpleField() {
		if (simpleField == null) {
			simpleField = new EObjectContainmentEList<SimpleFieldType>(SimpleFieldType.class, this, KMLPackage.SCHEMA_TYPE__SIMPLE_FIELD);
		}
		return simpleField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSchemaExtensionGroup() {
		if (schemaExtensionGroup == null) {
			schemaExtensionGroup = new BasicFeatureMap(this, KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION_GROUP);
		}
		return schemaExtensionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getSchemaExtension() {
		return getSchemaExtensionGroup().list(KMLPackage.eINSTANCE.getSchemaType_SchemaExtension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCHEMA_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCHEMA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.SCHEMA_TYPE__SIMPLE_FIELD:
				return ((InternalEList<?>)getSimpleField()).basicRemove(otherEnd, msgs);
			case KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION_GROUP:
				return ((InternalEList<?>)getSchemaExtensionGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION:
				return ((InternalEList<?>)getSchemaExtension()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.SCHEMA_TYPE__SIMPLE_FIELD:
				return getSimpleField();
			case KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION_GROUP:
				if (coreType) return getSchemaExtensionGroup();
				return ((FeatureMap.Internal)getSchemaExtensionGroup()).getWrapper();
			case KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION:
				return getSchemaExtension();
			case KMLPackage.SCHEMA_TYPE__ID:
				return getId();
			case KMLPackage.SCHEMA_TYPE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KMLPackage.SCHEMA_TYPE__SIMPLE_FIELD:
				getSimpleField().clear();
				getSimpleField().addAll((Collection<? extends SimpleFieldType>)newValue);
				return;
			case KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION_GROUP:
				((FeatureMap.Internal)getSchemaExtensionGroup()).set(newValue);
				return;
			case KMLPackage.SCHEMA_TYPE__ID:
				setId((String)newValue);
				return;
			case KMLPackage.SCHEMA_TYPE__NAME:
				setName((String)newValue);
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
			case KMLPackage.SCHEMA_TYPE__SIMPLE_FIELD:
				getSimpleField().clear();
				return;
			case KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION_GROUP:
				getSchemaExtensionGroup().clear();
				return;
			case KMLPackage.SCHEMA_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case KMLPackage.SCHEMA_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case KMLPackage.SCHEMA_TYPE__SIMPLE_FIELD:
				return simpleField != null && !simpleField.isEmpty();
			case KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION_GROUP:
				return schemaExtensionGroup != null && !schemaExtensionGroup.isEmpty();
			case KMLPackage.SCHEMA_TYPE__SCHEMA_EXTENSION:
				return !getSchemaExtension().isEmpty();
			case KMLPackage.SCHEMA_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case KMLPackage.SCHEMA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (schemaExtensionGroup: ");
		result.append(schemaExtensionGroup);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchemaTypeImpl
