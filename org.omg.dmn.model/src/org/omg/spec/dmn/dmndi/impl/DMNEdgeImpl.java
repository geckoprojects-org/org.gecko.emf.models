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

import org.omg.spec.dmn.di.impl.EdgeImpl;

import org.omg.spec.dmn.dmndi.DMNDIPackage;
import org.omg.spec.dmn.dmndi.DMNEdge;
import org.omg.spec.dmn.dmndi.DMNLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMN Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNEdgeImpl#getDMNLabel <em>DMN Label</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNEdgeImpl#getDmnElementRef <em>Dmn Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNEdgeImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNEdgeImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DMNEdgeImpl extends EdgeImpl implements DMNEdge {
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
	 * The default value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected static final QName SOURCE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected QName sourceElement = SOURCE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected static final QName TARGET_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected QName targetElement = TARGET_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMNEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNDIPackage.Literals.DMN_EDGE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_EDGE__DMN_LABEL, oldDMNLabel, newDMNLabel);
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
				msgs = ((InternalEObject)dMNLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_EDGE__DMN_LABEL, null, msgs);
			if (newDMNLabel != null)
				msgs = ((InternalEObject)newDMNLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_EDGE__DMN_LABEL, null, msgs);
			msgs = basicSetDMNLabel(newDMNLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_EDGE__DMN_LABEL, newDMNLabel, newDMNLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_EDGE__DMN_ELEMENT_REF, oldDmnElementRef, dmnElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceElement(QName newSourceElement) {
		QName oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_EDGE__SOURCE_ELEMENT, oldSourceElement, sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetElement(QName newTargetElement) {
		QName oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_EDGE__TARGET_ELEMENT, oldTargetElement, targetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNDIPackage.DMN_EDGE__DMN_LABEL:
				return basicSetDMNLabel(null, msgs);
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
			case DMNDIPackage.DMN_EDGE__DMN_LABEL:
				return getDMNLabel();
			case DMNDIPackage.DMN_EDGE__DMN_ELEMENT_REF:
				return getDmnElementRef();
			case DMNDIPackage.DMN_EDGE__SOURCE_ELEMENT:
				return getSourceElement();
			case DMNDIPackage.DMN_EDGE__TARGET_ELEMENT:
				return getTargetElement();
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
			case DMNDIPackage.DMN_EDGE__DMN_LABEL:
				setDMNLabel((DMNLabel)newValue);
				return;
			case DMNDIPackage.DMN_EDGE__DMN_ELEMENT_REF:
				setDmnElementRef((QName)newValue);
				return;
			case DMNDIPackage.DMN_EDGE__SOURCE_ELEMENT:
				setSourceElement((QName)newValue);
				return;
			case DMNDIPackage.DMN_EDGE__TARGET_ELEMENT:
				setTargetElement((QName)newValue);
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
			case DMNDIPackage.DMN_EDGE__DMN_LABEL:
				setDMNLabel((DMNLabel)null);
				return;
			case DMNDIPackage.DMN_EDGE__DMN_ELEMENT_REF:
				setDmnElementRef(DMN_ELEMENT_REF_EDEFAULT);
				return;
			case DMNDIPackage.DMN_EDGE__SOURCE_ELEMENT:
				setSourceElement(SOURCE_ELEMENT_EDEFAULT);
				return;
			case DMNDIPackage.DMN_EDGE__TARGET_ELEMENT:
				setTargetElement(TARGET_ELEMENT_EDEFAULT);
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
			case DMNDIPackage.DMN_EDGE__DMN_LABEL:
				return dMNLabel != null;
			case DMNDIPackage.DMN_EDGE__DMN_ELEMENT_REF:
				return DMN_ELEMENT_REF_EDEFAULT == null ? dmnElementRef != null : !DMN_ELEMENT_REF_EDEFAULT.equals(dmnElementRef);
			case DMNDIPackage.DMN_EDGE__SOURCE_ELEMENT:
				return SOURCE_ELEMENT_EDEFAULT == null ? sourceElement != null : !SOURCE_ELEMENT_EDEFAULT.equals(sourceElement);
			case DMNDIPackage.DMN_EDGE__TARGET_ELEMENT:
				return TARGET_ELEMENT_EDEFAULT == null ? targetElement != null : !TARGET_ELEMENT_EDEFAULT.equals(targetElement);
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
		result.append(", sourceElement: ");
		result.append(sourceElement);
		result.append(", targetElement: ");
		result.append(targetElement);
		result.append(')');
		return result.toString();
	}

} //DMNEdgeImpl
