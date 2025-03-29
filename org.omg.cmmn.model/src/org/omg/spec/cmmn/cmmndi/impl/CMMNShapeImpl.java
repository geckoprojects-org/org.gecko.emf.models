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
package org.omg.spec.cmmn.cmmndi.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.cmmn.cmmndi.CMMNDIPackage;
import org.omg.spec.cmmn.cmmndi.CMMNLabel;
import org.omg.spec.cmmn.cmmndi.CMMNShape;

import org.omg.spec.cmmn.di.impl.ShapeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMN Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNShapeImpl#getCMMNLabel <em>CMMN Label</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNShapeImpl#getCmmnElementRef <em>Cmmn Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNShapeImpl#isIsCollapsed <em>Is Collapsed</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNShapeImpl#isIsPlanningTableCollapsed <em>Is Planning Table Collapsed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMMNShapeImpl extends ShapeImpl implements CMMNShape {
	/**
	 * The cached value of the '{@link #getCMMNLabel() <em>CMMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMMNLabel()
	 * @generated
	 * @ordered
	 */
	protected CMMNLabel cMMNLabel;

	/**
	 * The default value of the '{@link #getCmmnElementRef() <em>Cmmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmmnElementRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName CMMN_ELEMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmmnElementRef() <em>Cmmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmmnElementRef()
	 * @generated
	 * @ordered
	 */
	protected QName cmmnElementRef = CMMN_ELEMENT_REF_EDEFAULT;

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
	 * The default value of the '{@link #isIsPlanningTableCollapsed() <em>Is Planning Table Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanningTableCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLANNING_TABLE_COLLAPSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlanningTableCollapsed() <em>Is Planning Table Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanningTableCollapsed()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlanningTableCollapsed = IS_PLANNING_TABLE_COLLAPSED_EDEFAULT;

	/**
	 * This is true if the Is Planning Table Collapsed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPlanningTableCollapsedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMMNShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNDIPackage.Literals.CMMN_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNLabel getCMMNLabel() {
		return cMMNLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNLabel(CMMNLabel newCMMNLabel, NotificationChain msgs) {
		CMMNLabel oldCMMNLabel = cMMNLabel;
		cMMNLabel = newCMMNLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL, oldCMMNLabel, newCMMNLabel);
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
	public void setCMMNLabel(CMMNLabel newCMMNLabel) {
		if (newCMMNLabel != cMMNLabel) {
			NotificationChain msgs = null;
			if (cMMNLabel != null)
				msgs = ((InternalEObject)cMMNLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL, null, msgs);
			if (newCMMNLabel != null)
				msgs = ((InternalEObject)newCMMNLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL, null, msgs);
			msgs = basicSetCMMNLabel(newCMMNLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL, newCMMNLabel, newCMMNLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getCmmnElementRef() {
		return cmmnElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCmmnElementRef(QName newCmmnElementRef) {
		QName oldCmmnElementRef = cmmnElementRef;
		cmmnElementRef = newCmmnElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT_REF, oldCmmnElementRef, cmmnElementRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__IS_COLLAPSED, oldIsCollapsed, isCollapsed, !oldIsCollapsedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CMMNDIPackage.CMMN_SHAPE__IS_COLLAPSED, oldIsCollapsed, IS_COLLAPSED_EDEFAULT, oldIsCollapsedESet));
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
	public boolean isIsPlanningTableCollapsed() {
		return isPlanningTableCollapsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPlanningTableCollapsed(boolean newIsPlanningTableCollapsed) {
		boolean oldIsPlanningTableCollapsed = isPlanningTableCollapsed;
		isPlanningTableCollapsed = newIsPlanningTableCollapsed;
		boolean oldIsPlanningTableCollapsedESet = isPlanningTableCollapsedESet;
		isPlanningTableCollapsedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED, oldIsPlanningTableCollapsed, isPlanningTableCollapsed, !oldIsPlanningTableCollapsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsPlanningTableCollapsed() {
		boolean oldIsPlanningTableCollapsed = isPlanningTableCollapsed;
		boolean oldIsPlanningTableCollapsedESet = isPlanningTableCollapsedESet;
		isPlanningTableCollapsed = IS_PLANNING_TABLE_COLLAPSED_EDEFAULT;
		isPlanningTableCollapsedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED, oldIsPlanningTableCollapsed, IS_PLANNING_TABLE_COLLAPSED_EDEFAULT, oldIsPlanningTableCollapsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsPlanningTableCollapsed() {
		return isPlanningTableCollapsedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL:
				return basicSetCMMNLabel(null, msgs);
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
			case CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL:
				return getCMMNLabel();
			case CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT_REF:
				return getCmmnElementRef();
			case CMMNDIPackage.CMMN_SHAPE__IS_COLLAPSED:
				return isIsCollapsed();
			case CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED:
				return isIsPlanningTableCollapsed();
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
			case CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL:
				setCMMNLabel((CMMNLabel)newValue);
				return;
			case CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT_REF:
				setCmmnElementRef((QName)newValue);
				return;
			case CMMNDIPackage.CMMN_SHAPE__IS_COLLAPSED:
				setIsCollapsed((Boolean)newValue);
				return;
			case CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED:
				setIsPlanningTableCollapsed((Boolean)newValue);
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
			case CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL:
				setCMMNLabel((CMMNLabel)null);
				return;
			case CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT_REF:
				setCmmnElementRef(CMMN_ELEMENT_REF_EDEFAULT);
				return;
			case CMMNDIPackage.CMMN_SHAPE__IS_COLLAPSED:
				unsetIsCollapsed();
				return;
			case CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED:
				unsetIsPlanningTableCollapsed();
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
			case CMMNDIPackage.CMMN_SHAPE__CMMN_LABEL:
				return cMMNLabel != null;
			case CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT_REF:
				return CMMN_ELEMENT_REF_EDEFAULT == null ? cmmnElementRef != null : !CMMN_ELEMENT_REF_EDEFAULT.equals(cmmnElementRef);
			case CMMNDIPackage.CMMN_SHAPE__IS_COLLAPSED:
				return isSetIsCollapsed();
			case CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_COLLAPSED:
				return isSetIsPlanningTableCollapsed();
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
		result.append(" (cmmnElementRef: ");
		result.append(cmmnElementRef);
		result.append(", isCollapsed: ");
		if (isCollapsedESet) result.append(isCollapsed); else result.append("<unset>");
		result.append(", isPlanningTableCollapsed: ");
		if (isPlanningTableCollapsedESet) result.append(isPlanningTableCollapsed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CMMNShapeImpl
