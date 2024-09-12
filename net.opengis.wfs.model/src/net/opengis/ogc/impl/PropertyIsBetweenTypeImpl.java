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
package net.opengis.ogc.impl;

import net.opengis.ogc.ExpressionType;
import net.opengis.ogc.LowerBoundaryType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.PropertyIsBetweenType;
import net.opengis.ogc.UpperBoundaryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Is Between Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsBetweenTypeImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsBetweenTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsBetweenTypeImpl#getLowerBoundary <em>Lower Boundary</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsBetweenTypeImpl#getUpperBoundary <em>Upper Boundary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyIsBetweenTypeImpl extends ComparisonOpsTypeImpl implements PropertyIsBetweenType {
	/**
	 * The cached value of the '{@link #getExpressionGroup() <em>Expression Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap expressionGroup;

	/**
	 * The cached value of the '{@link #getLowerBoundary() <em>Lower Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundary()
	 * @generated
	 * @ordered
	 */
	protected LowerBoundaryType lowerBoundary;

	/**
	 * The cached value of the '{@link #getUpperBoundary() <em>Upper Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundary()
	 * @generated
	 * @ordered
	 */
	protected UpperBoundaryType upperBoundary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyIsBetweenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.PROPERTY_IS_BETWEEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExpressionGroup() {
		if (expressionGroup == null) {
			expressionGroup = new BasicFeatureMap(this, OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP);
		}
		return expressionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionType getExpression() {
		return (ExpressionType)getExpressionGroup().get(OGCPackage.Literals.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionType newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExpressionGroup()).basicAdd(OGCPackage.Literals.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION, newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowerBoundaryType getLowerBoundary() {
		return lowerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBoundary(LowerBoundaryType newLowerBoundary, NotificationChain msgs) {
		LowerBoundaryType oldLowerBoundary = lowerBoundary;
		lowerBoundary = newLowerBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY, oldLowerBoundary, newLowerBoundary);
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
	public void setLowerBoundary(LowerBoundaryType newLowerBoundary) {
		if (newLowerBoundary != lowerBoundary) {
			NotificationChain msgs = null;
			if (lowerBoundary != null)
				msgs = ((InternalEObject)lowerBoundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY, null, msgs);
			if (newLowerBoundary != null)
				msgs = ((InternalEObject)newLowerBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY, null, msgs);
			msgs = basicSetLowerBoundary(newLowerBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY, newLowerBoundary, newLowerBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpperBoundaryType getUpperBoundary() {
		return upperBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBoundary(UpperBoundaryType newUpperBoundary, NotificationChain msgs) {
		UpperBoundaryType oldUpperBoundary = upperBoundary;
		upperBoundary = newUpperBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY, oldUpperBoundary, newUpperBoundary);
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
	public void setUpperBoundary(UpperBoundaryType newUpperBoundary) {
		if (newUpperBoundary != upperBoundary) {
			NotificationChain msgs = null;
			if (upperBoundary != null)
				msgs = ((InternalEObject)upperBoundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY, null, msgs);
			if (newUpperBoundary != null)
				msgs = ((InternalEObject)newUpperBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY, null, msgs);
			msgs = basicSetUpperBoundary(newUpperBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY, newUpperBoundary, newUpperBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP:
				return ((InternalEList<?>)getExpressionGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION:
				return basicSetExpression(null, msgs);
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY:
				return basicSetLowerBoundary(null, msgs);
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY:
				return basicSetUpperBoundary(null, msgs);
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
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP:
				if (coreType) return getExpressionGroup();
				return ((FeatureMap.Internal)getExpressionGroup()).getWrapper();
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION:
				return getExpression();
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY:
				return getLowerBoundary();
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY:
				return getUpperBoundary();
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
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP:
				((FeatureMap.Internal)getExpressionGroup()).set(newValue);
				return;
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY:
				setLowerBoundary((LowerBoundaryType)newValue);
				return;
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY:
				setUpperBoundary((UpperBoundaryType)newValue);
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
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP:
				getExpressionGroup().clear();
				return;
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY:
				setLowerBoundary((LowerBoundaryType)null);
				return;
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY:
				setUpperBoundary((UpperBoundaryType)null);
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
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP:
				return expressionGroup != null && !expressionGroup.isEmpty();
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__EXPRESSION:
				return getExpression() != null;
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY:
				return lowerBoundary != null;
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY:
				return upperBoundary != null;
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
		result.append(" (expressionGroup: ");
		result.append(expressionGroup);
		result.append(')');
		return result.toString();
	}

} //PropertyIsBetweenTypeImpl
