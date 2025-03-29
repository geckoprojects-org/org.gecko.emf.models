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
package org.omg.spec.dmn.dmndi.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.dmn.di.impl.ShapeImpl;

import org.omg.spec.dmn.dmndi.DMNDIPackage;
import org.omg.spec.dmn.dmndi.DMNDecisionServiceDividerLine;
import org.omg.spec.dmn.dmndi.DMNLabel;
import org.omg.spec.dmn.dmndi.DMNShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMN Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNShapeImpl#getDMNLabel <em>DMN Label</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNShapeImpl#getDMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNShapeImpl#getDmnElementRef <em>Dmn Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNShapeImpl#isIsCollapsed <em>Is Collapsed</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNShapeImpl#isIsListedInputData <em>Is Listed Input Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DMNShapeImpl extends ShapeImpl implements DMNShape {
	/**
	 * The cached value of the '{@link #getDMNLabel() <em>DMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMNLabel()
	 * @generated
	 * @ordered
	 */
	protected DMNLabel dMNLabel;

	/**
	 * The cached value of the '{@link #getDMNDecisionServiceDividerLine() <em>DMN Decision Service Divider Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMNDecisionServiceDividerLine()
	 * @generated
	 * @ordered
	 */
	protected DMNDecisionServiceDividerLine dMNDecisionServiceDividerLine;

	/**
	 * The default value of the '{@link #getDmnElementRef() <em>Dmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmnElementRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName DMN_ELEMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmnElementRef() <em>Dmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmnElementRef()
	 * @generated
	 * @ordered
	 */
	protected QName dmnElementRef = DMN_ELEMENT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCollapsed() <em>Is Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLAPSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCollapsed() <em>Is Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollapsed()
	 * @generated
	 * @ordered
	 */
	protected boolean isCollapsed = IS_COLLAPSED_EDEFAULT;

	/**
	 * This is true if the Is Collapsed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCollapsedESet;

	/**
	 * The default value of the '{@link #isIsListedInputData() <em>Is Listed Input Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsListedInputData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LISTED_INPUT_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsListedInputData() <em>Is Listed Input Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsListedInputData()
	 * @generated
	 * @ordered
	 */
	protected boolean isListedInputData = IS_LISTED_INPUT_DATA_EDEFAULT;

	/**
	 * This is true if the Is Listed Input Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isListedInputDataESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMNShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNDIPackage.Literals.DMN_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNLabel getDMNLabel() {
		return dMNLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNLabel(DMNLabel newDMNLabel, NotificationChain msgs) {
		DMNLabel oldDMNLabel = dMNLabel;
		dMNLabel = newDMNLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_SHAPE__DMN_LABEL, oldDMNLabel, newDMNLabel);
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
	public void setDMNLabel(DMNLabel newDMNLabel) {
		if (newDMNLabel != dMNLabel) {
			NotificationChain msgs = null;
			if (dMNLabel != null)
				msgs = ((InternalEObject)dMNLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_SHAPE__DMN_LABEL, null, msgs);
			if (newDMNLabel != null)
				msgs = ((InternalEObject)newDMNLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_SHAPE__DMN_LABEL, null, msgs);
			msgs = basicSetDMNLabel(newDMNLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_SHAPE__DMN_LABEL, newDMNLabel, newDMNLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDecisionServiceDividerLine getDMNDecisionServiceDividerLine() {
		return dMNDecisionServiceDividerLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNDecisionServiceDividerLine(DMNDecisionServiceDividerLine newDMNDecisionServiceDividerLine, NotificationChain msgs) {
		DMNDecisionServiceDividerLine oldDMNDecisionServiceDividerLine = dMNDecisionServiceDividerLine;
		dMNDecisionServiceDividerLine = newDMNDecisionServiceDividerLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE, oldDMNDecisionServiceDividerLine, newDMNDecisionServiceDividerLine);
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
	public void setDMNDecisionServiceDividerLine(DMNDecisionServiceDividerLine newDMNDecisionServiceDividerLine) {
		if (newDMNDecisionServiceDividerLine != dMNDecisionServiceDividerLine) {
			NotificationChain msgs = null;
			if (dMNDecisionServiceDividerLine != null)
				msgs = ((InternalEObject)dMNDecisionServiceDividerLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE, null, msgs);
			if (newDMNDecisionServiceDividerLine != null)
				msgs = ((InternalEObject)newDMNDecisionServiceDividerLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE, null, msgs);
			msgs = basicSetDMNDecisionServiceDividerLine(newDMNDecisionServiceDividerLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE, newDMNDecisionServiceDividerLine, newDMNDecisionServiceDividerLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getDmnElementRef() {
		return dmnElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDmnElementRef(QName newDmnElementRef) {
		QName oldDmnElementRef = dmnElementRef;
		dmnElementRef = newDmnElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_SHAPE__DMN_ELEMENT_REF, oldDmnElementRef, dmnElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCollapsed() {
		return isCollapsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCollapsed(boolean newIsCollapsed) {
		boolean oldIsCollapsed = isCollapsed;
		isCollapsed = newIsCollapsed;
		boolean oldIsCollapsedESet = isCollapsedESet;
		isCollapsedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_SHAPE__IS_COLLAPSED, oldIsCollapsed, isCollapsed, !oldIsCollapsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsCollapsed() {
		boolean oldIsCollapsed = isCollapsed;
		boolean oldIsCollapsedESet = isCollapsedESet;
		isCollapsed = IS_COLLAPSED_EDEFAULT;
		isCollapsedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_SHAPE__IS_COLLAPSED, oldIsCollapsed, IS_COLLAPSED_EDEFAULT, oldIsCollapsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsCollapsed() {
		return isCollapsedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsListedInputData() {
		return isListedInputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsListedInputData(boolean newIsListedInputData) {
		boolean oldIsListedInputData = isListedInputData;
		isListedInputData = newIsListedInputData;
		boolean oldIsListedInputDataESet = isListedInputDataESet;
		isListedInputDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_SHAPE__IS_LISTED_INPUT_DATA, oldIsListedInputData, isListedInputData, !oldIsListedInputDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsListedInputData() {
		boolean oldIsListedInputData = isListedInputData;
		boolean oldIsListedInputDataESet = isListedInputDataESet;
		isListedInputData = IS_LISTED_INPUT_DATA_EDEFAULT;
		isListedInputDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_SHAPE__IS_LISTED_INPUT_DATA, oldIsListedInputData, IS_LISTED_INPUT_DATA_EDEFAULT, oldIsListedInputDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsListedInputData() {
		return isListedInputDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNDIPackage.DMN_SHAPE__DMN_LABEL:
				return basicSetDMNLabel(null, msgs);
			case DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE:
				return basicSetDMNDecisionServiceDividerLine(null, msgs);
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
			case DMNDIPackage.DMN_SHAPE__DMN_LABEL:
				return getDMNLabel();
			case DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE:
				return getDMNDecisionServiceDividerLine();
			case DMNDIPackage.DMN_SHAPE__DMN_ELEMENT_REF:
				return getDmnElementRef();
			case DMNDIPackage.DMN_SHAPE__IS_COLLAPSED:
				return isIsCollapsed();
			case DMNDIPackage.DMN_SHAPE__IS_LISTED_INPUT_DATA:
				return isIsListedInputData();
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
			case DMNDIPackage.DMN_SHAPE__DMN_LABEL:
				setDMNLabel((DMNLabel)newValue);
				return;
			case DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE:
				setDMNDecisionServiceDividerLine((DMNDecisionServiceDividerLine)newValue);
				return;
			case DMNDIPackage.DMN_SHAPE__DMN_ELEMENT_REF:
				setDmnElementRef((QName)newValue);
				return;
			case DMNDIPackage.DMN_SHAPE__IS_COLLAPSED:
				setIsCollapsed((Boolean)newValue);
				return;
			case DMNDIPackage.DMN_SHAPE__IS_LISTED_INPUT_DATA:
				setIsListedInputData((Boolean)newValue);
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
			case DMNDIPackage.DMN_SHAPE__DMN_LABEL:
				setDMNLabel((DMNLabel)null);
				return;
			case DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE:
				setDMNDecisionServiceDividerLine((DMNDecisionServiceDividerLine)null);
				return;
			case DMNDIPackage.DMN_SHAPE__DMN_ELEMENT_REF:
				setDmnElementRef(DMN_ELEMENT_REF_EDEFAULT);
				return;
			case DMNDIPackage.DMN_SHAPE__IS_COLLAPSED:
				unsetIsCollapsed();
				return;
			case DMNDIPackage.DMN_SHAPE__IS_LISTED_INPUT_DATA:
				unsetIsListedInputData();
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
			case DMNDIPackage.DMN_SHAPE__DMN_LABEL:
				return dMNLabel != null;
			case DMNDIPackage.DMN_SHAPE__DMN_DECISION_SERVICE_DIVIDER_LINE:
				return dMNDecisionServiceDividerLine != null;
			case DMNDIPackage.DMN_SHAPE__DMN_ELEMENT_REF:
				return DMN_ELEMENT_REF_EDEFAULT == null ? dmnElementRef != null : !DMN_ELEMENT_REF_EDEFAULT.equals(dmnElementRef);
			case DMNDIPackage.DMN_SHAPE__IS_COLLAPSED:
				return isSetIsCollapsed();
			case DMNDIPackage.DMN_SHAPE__IS_LISTED_INPUT_DATA:
				return isSetIsListedInputData();
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
		result.append(" (dmnElementRef: ");
		result.append(dmnElementRef);
		result.append(", isCollapsed: ");
		if (isCollapsedESet) result.append(isCollapsed); else result.append("<unset>");
		result.append(", isListedInputData: ");
		if (isListedInputDataESet) result.append(isListedInputData); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DMNShapeImpl
