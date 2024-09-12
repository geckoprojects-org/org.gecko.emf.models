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
package net.opengis.gml.gml.impl;

import java.util.Collection;

import net.opengis.gml.gml.AbstractGeometryType;
import net.opengis.gml.gml.AbstractTimeObjectType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.ValueArrayPropertyType;

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
 * An implementation of the model object '<em><b>Value Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#getAbstractValueGroup <em>Abstract Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#getAbstractValue <em>Abstract Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#getAbstractGeometry <em>Abstract Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#getAbstractTimeObjectGroup <em>Abstract Time Object Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#getAbstractTimeObject <em>Abstract Time Object</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#getNull <em>Null</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ValueArrayPropertyTypeImpl#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements ValueArrayPropertyType {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap value;

	/**
	 * The default value of the '{@link #isOwns() <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OWNS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOwns() <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwns()
	 * @generated
	 * @ordered
	 */
	protected boolean owns = OWNS_EDEFAULT;

	/**
	 * This is true if the Owns attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ownsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getValueArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getValue() {
		if (value == null) {
			value = new BasicFeatureMap(this, GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractValueGroup() {
		return (FeatureMap)getValue().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getValueArrayPropertyType_AbstractValueGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getAbstractValue() {
		return getAbstractValueGroup().list(GMLPackage.eINSTANCE.getValueArrayPropertyType_AbstractValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractGeometryGroup() {
		return (FeatureMap)getValue().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getValueArrayPropertyType_AbstractGeometryGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeometryType> getAbstractGeometry() {
		return getAbstractGeometryGroup().list(GMLPackage.eINSTANCE.getValueArrayPropertyType_AbstractGeometry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractTimeObjectGroup() {
		return (FeatureMap)getValue().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getValueArrayPropertyType_AbstractTimeObjectGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTimeObjectType> getAbstractTimeObject() {
		return getAbstractTimeObjectGroup().list(GMLPackage.eINSTANCE.getValueArrayPropertyType_AbstractTimeObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getNull() {
		return getValue().list(GMLPackage.eINSTANCE.getValueArrayPropertyType_Null());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOwns() {
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwns(boolean newOwns) {
		boolean oldOwns = owns;
		owns = newOwns;
		boolean oldOwnsESet = ownsESet;
		ownsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__OWNS, oldOwns, owns, !oldOwnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOwns() {
		boolean oldOwns = owns;
		boolean oldOwnsESet = ownsESet;
		owns = OWNS_EDEFAULT;
		ownsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__OWNS, oldOwns, OWNS_EDEFAULT, oldOwnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwns() {
		return ownsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_VALUE_GROUP:
				return ((InternalEList<?>)getAbstractValueGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_VALUE:
				return ((InternalEList<?>)getAbstractValue()).basicRemove(otherEnd, msgs);
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return ((InternalEList<?>)getAbstractGeometryGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_GEOMETRY:
				return ((InternalEList<?>)getAbstractGeometry()).basicRemove(otherEnd, msgs);
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_TIME_OBJECT_GROUP:
				return ((InternalEList<?>)getAbstractTimeObjectGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_TIME_OBJECT:
				return ((InternalEList<?>)getAbstractTimeObject()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__VALUE:
				if (coreType) return getValue();
				return ((FeatureMap.Internal)getValue()).getWrapper();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_VALUE_GROUP:
				if (coreType) return getAbstractValueGroup();
				return ((FeatureMap.Internal)getAbstractValueGroup()).getWrapper();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_VALUE:
				return getAbstractValue();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				if (coreType) return getAbstractGeometryGroup();
				return ((FeatureMap.Internal)getAbstractGeometryGroup()).getWrapper();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_GEOMETRY:
				return getAbstractGeometry();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_TIME_OBJECT_GROUP:
				if (coreType) return getAbstractTimeObjectGroup();
				return ((FeatureMap.Internal)getAbstractTimeObjectGroup()).getWrapper();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_TIME_OBJECT:
				return getAbstractTimeObject();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__NULL:
				return getNull();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__OWNS:
				return isOwns();
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
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__VALUE:
				((FeatureMap.Internal)getValue()).set(newValue);
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_VALUE_GROUP:
				((FeatureMap.Internal)getAbstractValueGroup()).set(newValue);
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				((FeatureMap.Internal)getAbstractGeometryGroup()).set(newValue);
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_TIME_OBJECT_GROUP:
				((FeatureMap.Internal)getAbstractTimeObjectGroup()).set(newValue);
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__NULL:
				getNull().clear();
				getNull().addAll((Collection<? extends Object>)newValue);
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__OWNS:
				setOwns((Boolean)newValue);
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
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__VALUE:
				getValue().clear();
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_VALUE_GROUP:
				getAbstractValueGroup().clear();
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				getAbstractGeometryGroup().clear();
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_TIME_OBJECT_GROUP:
				getAbstractTimeObjectGroup().clear();
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__NULL:
				getNull().clear();
				return;
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__OWNS:
				unsetOwns();
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
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__VALUE:
				return value != null && !value.isEmpty();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_VALUE_GROUP:
				return !getAbstractValueGroup().isEmpty();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_VALUE:
				return !getAbstractValue().isEmpty();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return !getAbstractGeometryGroup().isEmpty();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_GEOMETRY:
				return !getAbstractGeometry().isEmpty();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_TIME_OBJECT_GROUP:
				return !getAbstractTimeObjectGroup().isEmpty();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__ABSTRACT_TIME_OBJECT:
				return !getAbstractTimeObject().isEmpty();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__NULL:
				return !getNull().isEmpty();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE__OWNS:
				return isSetOwns();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", owns: ");
		if (ownsESet) result.append(owns); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ValueArrayPropertyTypeImpl
