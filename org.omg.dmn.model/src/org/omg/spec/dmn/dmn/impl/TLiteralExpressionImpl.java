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
package org.omg.spec.dmn.dmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TImportedValues;
import org.omg.spec.dmn.dmn.TLiteralExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLiteral Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TLiteralExpressionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TLiteralExpressionImpl#getImportedValues <em>Imported Values</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TLiteralExpressionImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLiteralExpressionImpl extends TExpressionImpl implements TLiteralExpression {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportedValues() <em>Imported Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedValues()
	 * @generated
	 * @ordered
	 */
	protected TImportedValues importedValues;

	/**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TLITERAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TLITERAL_EXPRESSION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImportedValues getImportedValues() {
		return importedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedValues(TImportedValues newImportedValues, NotificationChain msgs) {
		TImportedValues oldImportedValues = importedValues;
		importedValues = newImportedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES, oldImportedValues, newImportedValues);
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
	public void setImportedValues(TImportedValues newImportedValues) {
		if (newImportedValues != importedValues) {
			NotificationChain msgs = null;
			if (importedValues != null)
				msgs = ((InternalEObject)importedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES, null, msgs);
			if (newImportedValues != null)
				msgs = ((InternalEObject)newImportedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES, null, msgs);
			msgs = basicSetImportedValues(newImportedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES, newImportedValues, newImportedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressionLanguage() {
		return expressionLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionLanguage(String newExpressionLanguage) {
		String oldExpressionLanguage = expressionLanguage;
		expressionLanguage = newExpressionLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TLITERAL_EXPRESSION__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES:
				return basicSetImportedValues(null, msgs);
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
			case DMNPackage.TLITERAL_EXPRESSION__TEXT:
				return getText();
			case DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES:
				return getImportedValues();
			case DMNPackage.TLITERAL_EXPRESSION__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
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
			case DMNPackage.TLITERAL_EXPRESSION__TEXT:
				setText((String)newValue);
				return;
			case DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES:
				setImportedValues((TImportedValues)newValue);
				return;
			case DMNPackage.TLITERAL_EXPRESSION__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
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
			case DMNPackage.TLITERAL_EXPRESSION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES:
				setImportedValues((TImportedValues)null);
				return;
			case DMNPackage.TLITERAL_EXPRESSION__EXPRESSION_LANGUAGE:
				setExpressionLanguage(EXPRESSION_LANGUAGE_EDEFAULT);
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
			case DMNPackage.TLITERAL_EXPRESSION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case DMNPackage.TLITERAL_EXPRESSION__IMPORTED_VALUES:
				return importedValues != null;
			case DMNPackage.TLITERAL_EXPRESSION__EXPRESSION_LANGUAGE:
				return EXPRESSION_LANGUAGE_EDEFAULT == null ? expressionLanguage != null : !EXPRESSION_LANGUAGE_EDEFAULT.equals(expressionLanguage);
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
		result.append(" (text: ");
		result.append(text);
		result.append(", expressionLanguage: ");
		result.append(expressionLanguage);
		result.append(')');
		return result.toString();
	}

} //TLiteralExpressionImpl
