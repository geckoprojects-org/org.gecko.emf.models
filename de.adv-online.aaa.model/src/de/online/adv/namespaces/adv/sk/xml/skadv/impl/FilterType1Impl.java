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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.BasicObjectTypeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.ExpressionType;
import de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.GeometryTypeType;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FilterType1Impl#getGeometryType <em>Geometry Type</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FilterType1Impl#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FilterType1Impl#getFeatureTypeName <em>Feature Type Name</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FilterType1Impl#getFeatureTypeNumber <em>Feature Type Number</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FilterType1Impl#getBasicObjectType <em>Basic Object Type</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.FilterType1Impl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterType1Impl extends ElementType1Impl implements FilterType1 {
	/**
	 * The default value of the '{@link #getGeometryType() <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryType()
	 * @generated
	 * @ordered
	 */
	protected static final GeometryTypeType GEOMETRY_TYPE_EDEFAULT = GeometryTypeType.POINT;

	/**
	 * The cached value of the '{@link #getGeometryType() <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryType()
	 * @generated
	 * @ordered
	 */
	protected GeometryTypeType geometryType = GEOMETRY_TYPE_EDEFAULT;

	/**
	 * This is true if the Geometry Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geometryTypeESet;

	/**
	 * The cached value of the '{@link #getModelClass() <em>Model Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelClass()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modelClass;

	/**
	 * The default value of the '{@link #getFeatureTypeName() <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final QName FEATURE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureTypeName() <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeName()
	 * @generated
	 * @ordered
	 */
	protected QName featureTypeName = FEATURE_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureTypeNumber() <em>Feature Type Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_TYPE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureTypeNumber() <em>Feature Type Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeNumber()
	 * @generated
	 * @ordered
	 */
	protected String featureTypeNumber = FEATURE_TYPE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasicObjectType() <em>Basic Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final BasicObjectTypeType BASIC_OBJECT_TYPE_EDEFAULT = BasicObjectTypeType.REO;

	/**
	 * The cached value of the '{@link #getBasicObjectType() <em>Basic Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicObjectType()
	 * @generated
	 * @ordered
	 */
	protected BasicObjectTypeType basicObjectType = BASIC_OBJECT_TYPE_EDEFAULT;

	/**
	 * This is true if the Basic Object Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean basicObjectTypeESet;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionType expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getFilterType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryTypeType getGeometryType() {
		return geometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeometryType(GeometryTypeType newGeometryType) {
		GeometryTypeType oldGeometryType = geometryType;
		geometryType = newGeometryType == null ? GEOMETRY_TYPE_EDEFAULT : newGeometryType;
		boolean oldGeometryTypeESet = geometryTypeESet;
		geometryTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.FILTER_TYPE1__GEOMETRY_TYPE, oldGeometryType, geometryType, !oldGeometryTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeometryType() {
		GeometryTypeType oldGeometryType = geometryType;
		boolean oldGeometryTypeESet = geometryTypeESet;
		geometryType = GEOMETRY_TYPE_EDEFAULT;
		geometryTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.FILTER_TYPE1__GEOMETRY_TYPE, oldGeometryType, GEOMETRY_TYPE_EDEFAULT, oldGeometryTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeometryType() {
		return geometryTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getModelClass() {
		if (modelClass == null) {
			modelClass = new EDataTypeEList<String>(String.class, this, AAAPackage.FILTER_TYPE1__MODEL_CLASS);
		}
		return modelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getFeatureTypeName() {
		return featureTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureTypeName(QName newFeatureTypeName) {
		QName oldFeatureTypeName = featureTypeName;
		featureTypeName = newFeatureTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NAME, oldFeatureTypeName, featureTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureTypeNumber() {
		return featureTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureTypeNumber(String newFeatureTypeNumber) {
		String oldFeatureTypeNumber = featureTypeNumber;
		featureTypeNumber = newFeatureTypeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NUMBER, oldFeatureTypeNumber, featureTypeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicObjectTypeType getBasicObjectType() {
		return basicObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasicObjectType(BasicObjectTypeType newBasicObjectType) {
		BasicObjectTypeType oldBasicObjectType = basicObjectType;
		basicObjectType = newBasicObjectType == null ? BASIC_OBJECT_TYPE_EDEFAULT : newBasicObjectType;
		boolean oldBasicObjectTypeESet = basicObjectTypeESet;
		basicObjectTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.FILTER_TYPE1__BASIC_OBJECT_TYPE, oldBasicObjectType, basicObjectType, !oldBasicObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBasicObjectType() {
		BasicObjectTypeType oldBasicObjectType = basicObjectType;
		boolean oldBasicObjectTypeESet = basicObjectTypeESet;
		basicObjectType = BASIC_OBJECT_TYPE_EDEFAULT;
		basicObjectTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.FILTER_TYPE1__BASIC_OBJECT_TYPE, oldBasicObjectType, BASIC_OBJECT_TYPE_EDEFAULT, oldBasicObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBasicObjectType() {
		return basicObjectTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionType getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionType newExpression, NotificationChain msgs) {
		ExpressionType oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.FILTER_TYPE1__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(ExpressionType newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.FILTER_TYPE1__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.FILTER_TYPE1__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.FILTER_TYPE1__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.FILTER_TYPE1__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case AAAPackage.FILTER_TYPE1__GEOMETRY_TYPE:
				return getGeometryType();
			case AAAPackage.FILTER_TYPE1__MODEL_CLASS:
				return getModelClass();
			case AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NAME:
				return getFeatureTypeName();
			case AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NUMBER:
				return getFeatureTypeNumber();
			case AAAPackage.FILTER_TYPE1__BASIC_OBJECT_TYPE:
				return getBasicObjectType();
			case AAAPackage.FILTER_TYPE1__EXPRESSION:
				return getExpression();
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
			case AAAPackage.FILTER_TYPE1__GEOMETRY_TYPE:
				setGeometryType((GeometryTypeType)newValue);
				return;
			case AAAPackage.FILTER_TYPE1__MODEL_CLASS:
				getModelClass().clear();
				getModelClass().addAll((Collection<? extends String>)newValue);
				return;
			case AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NAME:
				setFeatureTypeName((QName)newValue);
				return;
			case AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NUMBER:
				setFeatureTypeNumber((String)newValue);
				return;
			case AAAPackage.FILTER_TYPE1__BASIC_OBJECT_TYPE:
				setBasicObjectType((BasicObjectTypeType)newValue);
				return;
			case AAAPackage.FILTER_TYPE1__EXPRESSION:
				setExpression((ExpressionType)newValue);
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
			case AAAPackage.FILTER_TYPE1__GEOMETRY_TYPE:
				unsetGeometryType();
				return;
			case AAAPackage.FILTER_TYPE1__MODEL_CLASS:
				getModelClass().clear();
				return;
			case AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NAME:
				setFeatureTypeName(FEATURE_TYPE_NAME_EDEFAULT);
				return;
			case AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NUMBER:
				setFeatureTypeNumber(FEATURE_TYPE_NUMBER_EDEFAULT);
				return;
			case AAAPackage.FILTER_TYPE1__BASIC_OBJECT_TYPE:
				unsetBasicObjectType();
				return;
			case AAAPackage.FILTER_TYPE1__EXPRESSION:
				setExpression((ExpressionType)null);
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
			case AAAPackage.FILTER_TYPE1__GEOMETRY_TYPE:
				return isSetGeometryType();
			case AAAPackage.FILTER_TYPE1__MODEL_CLASS:
				return modelClass != null && !modelClass.isEmpty();
			case AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NAME:
				return FEATURE_TYPE_NAME_EDEFAULT == null ? featureTypeName != null : !FEATURE_TYPE_NAME_EDEFAULT.equals(featureTypeName);
			case AAAPackage.FILTER_TYPE1__FEATURE_TYPE_NUMBER:
				return FEATURE_TYPE_NUMBER_EDEFAULT == null ? featureTypeNumber != null : !FEATURE_TYPE_NUMBER_EDEFAULT.equals(featureTypeNumber);
			case AAAPackage.FILTER_TYPE1__BASIC_OBJECT_TYPE:
				return isSetBasicObjectType();
			case AAAPackage.FILTER_TYPE1__EXPRESSION:
				return expression != null;
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
		result.append(" (geometryType: ");
		if (geometryTypeESet) result.append(geometryType); else result.append("<unset>");
		result.append(", modelClass: ");
		result.append(modelClass);
		result.append(", featureTypeName: ");
		result.append(featureTypeName);
		result.append(", featureTypeNumber: ");
		result.append(featureTypeNumber);
		result.append(", basicObjectType: ");
		if (basicObjectTypeESet) result.append(basicObjectType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FilterType1Impl
