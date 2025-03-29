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
import org.omg.spec.cmmn.cmmndi.CMMNEdge;
import org.omg.spec.cmmn.cmmndi.CMMNLabel;

import org.omg.spec.cmmn.di.impl.EdgeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMN Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl#getCMMNLabel <em>CMMN Label</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl#getCmmnElementRef <em>Cmmn Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl#isIsStandardEventVisible <em>Is Standard Event Visible</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl#getSourceCMMNElementRef <em>Source CMMN Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNEdgeImpl#getTargetCMMNElementRef <em>Target CMMN Element Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMMNEdgeImpl extends EdgeImpl implements CMMNEdge {
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
	 * The default value of the '{@link #isIsStandardEventVisible() <em>Is Standard Event Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStandardEventVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STANDARD_EVENT_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStandardEventVisible() <em>Is Standard Event Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStandardEventVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean isStandardEventVisible = IS_STANDARD_EVENT_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Is Standard Event Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isStandardEventVisibleESet;

	/**
	 * The default value of the '{@link #getSourceCMMNElementRef() <em>Source CMMN Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCMMNElementRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName SOURCE_CMMN_ELEMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceCMMNElementRef() <em>Source CMMN Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCMMNElementRef()
	 * @generated
	 * @ordered
	 */
	protected QName sourceCMMNElementRef = SOURCE_CMMN_ELEMENT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCMMNElementRef() <em>Target CMMN Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCMMNElementRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName TARGET_CMMN_ELEMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetCMMNElementRef() <em>Target CMMN Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCMMNElementRef()
	 * @generated
	 * @ordered
	 */
	protected QName targetCMMNElementRef = TARGET_CMMN_ELEMENT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMMNEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNDIPackage.Literals.CMMN_EDGE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__CMMN_LABEL, oldCMMNLabel, newCMMNLabel);
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
				msgs = ((InternalEObject)cMMNLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNDIPackage.CMMN_EDGE__CMMN_LABEL, null, msgs);
			if (newCMMNLabel != null)
				msgs = ((InternalEObject)newCMMNLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNDIPackage.CMMN_EDGE__CMMN_LABEL, null, msgs);
			msgs = basicSetCMMNLabel(newCMMNLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__CMMN_LABEL, newCMMNLabel, newCMMNLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT_REF, oldCmmnElementRef, cmmnElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsStandardEventVisible() {
		return isStandardEventVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStandardEventVisible(boolean newIsStandardEventVisible) {
		boolean oldIsStandardEventVisible = isStandardEventVisible;
		isStandardEventVisible = newIsStandardEventVisible;
		boolean oldIsStandardEventVisibleESet = isStandardEventVisibleESet;
		isStandardEventVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE, oldIsStandardEventVisible, isStandardEventVisible, !oldIsStandardEventVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsStandardEventVisible() {
		boolean oldIsStandardEventVisible = isStandardEventVisible;
		boolean oldIsStandardEventVisibleESet = isStandardEventVisibleESet;
		isStandardEventVisible = IS_STANDARD_EVENT_VISIBLE_EDEFAULT;
		isStandardEventVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CMMNDIPackage.CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE, oldIsStandardEventVisible, IS_STANDARD_EVENT_VISIBLE_EDEFAULT, oldIsStandardEventVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsStandardEventVisible() {
		return isStandardEventVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getSourceCMMNElementRef() {
		return sourceCMMNElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceCMMNElementRef(QName newSourceCMMNElementRef) {
		QName oldSourceCMMNElementRef = sourceCMMNElementRef;
		sourceCMMNElementRef = newSourceCMMNElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__SOURCE_CMMN_ELEMENT_REF, oldSourceCMMNElementRef, sourceCMMNElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getTargetCMMNElementRef() {
		return targetCMMNElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetCMMNElementRef(QName newTargetCMMNElementRef) {
		QName oldTargetCMMNElementRef = targetCMMNElementRef;
		targetCMMNElementRef = newTargetCMMNElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__TARGET_CMMN_ELEMENT_REF, oldTargetCMMNElementRef, targetCMMNElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNDIPackage.CMMN_EDGE__CMMN_LABEL:
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
			case CMMNDIPackage.CMMN_EDGE__CMMN_LABEL:
				return getCMMNLabel();
			case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT_REF:
				return getCmmnElementRef();
			case CMMNDIPackage.CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE:
				return isIsStandardEventVisible();
			case CMMNDIPackage.CMMN_EDGE__SOURCE_CMMN_ELEMENT_REF:
				return getSourceCMMNElementRef();
			case CMMNDIPackage.CMMN_EDGE__TARGET_CMMN_ELEMENT_REF:
				return getTargetCMMNElementRef();
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
			case CMMNDIPackage.CMMN_EDGE__CMMN_LABEL:
				setCMMNLabel((CMMNLabel)newValue);
				return;
			case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT_REF:
				setCmmnElementRef((QName)newValue);
				return;
			case CMMNDIPackage.CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE:
				setIsStandardEventVisible((Boolean)newValue);
				return;
			case CMMNDIPackage.CMMN_EDGE__SOURCE_CMMN_ELEMENT_REF:
				setSourceCMMNElementRef((QName)newValue);
				return;
			case CMMNDIPackage.CMMN_EDGE__TARGET_CMMN_ELEMENT_REF:
				setTargetCMMNElementRef((QName)newValue);
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
			case CMMNDIPackage.CMMN_EDGE__CMMN_LABEL:
				setCMMNLabel((CMMNLabel)null);
				return;
			case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT_REF:
				setCmmnElementRef(CMMN_ELEMENT_REF_EDEFAULT);
				return;
			case CMMNDIPackage.CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE:
				unsetIsStandardEventVisible();
				return;
			case CMMNDIPackage.CMMN_EDGE__SOURCE_CMMN_ELEMENT_REF:
				setSourceCMMNElementRef(SOURCE_CMMN_ELEMENT_REF_EDEFAULT);
				return;
			case CMMNDIPackage.CMMN_EDGE__TARGET_CMMN_ELEMENT_REF:
				setTargetCMMNElementRef(TARGET_CMMN_ELEMENT_REF_EDEFAULT);
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
			case CMMNDIPackage.CMMN_EDGE__CMMN_LABEL:
				return cMMNLabel != null;
			case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT_REF:
				return CMMN_ELEMENT_REF_EDEFAULT == null ? cmmnElementRef != null : !CMMN_ELEMENT_REF_EDEFAULT.equals(cmmnElementRef);
			case CMMNDIPackage.CMMN_EDGE__IS_STANDARD_EVENT_VISIBLE:
				return isSetIsStandardEventVisible();
			case CMMNDIPackage.CMMN_EDGE__SOURCE_CMMN_ELEMENT_REF:
				return SOURCE_CMMN_ELEMENT_REF_EDEFAULT == null ? sourceCMMNElementRef != null : !SOURCE_CMMN_ELEMENT_REF_EDEFAULT.equals(sourceCMMNElementRef);
			case CMMNDIPackage.CMMN_EDGE__TARGET_CMMN_ELEMENT_REF:
				return TARGET_CMMN_ELEMENT_REF_EDEFAULT == null ? targetCMMNElementRef != null : !TARGET_CMMN_ELEMENT_REF_EDEFAULT.equals(targetCMMNElementRef);
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
		result.append(", isStandardEventVisible: ");
		if (isStandardEventVisibleESet) result.append(isStandardEventVisible); else result.append("<unset>");
		result.append(", sourceCMMNElementRef: ");
		result.append(sourceCMMNElementRef);
		result.append(", targetCMMNElementRef: ");
		result.append(targetCMMNElementRef);
		result.append(')');
		return result.toString();
	}

} //CMMNEdgeImpl
