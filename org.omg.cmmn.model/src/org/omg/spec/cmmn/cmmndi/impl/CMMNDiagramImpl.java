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

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.cmmndi.CMMNDIPackage;
import org.omg.spec.cmmn.cmmndi.CMMNDiagram;

import org.omg.spec.cmmn.dc.Dimension;

import org.omg.spec.cmmn.di.DiagramElement;

import org.omg.spec.cmmn.di.impl.DiagramImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDiagramImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDiagramImpl#getCMMNDiagramElementGroup <em>CMMN Diagram Element Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDiagramImpl#getCMMNDiagramElement <em>CMMN Diagram Element</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDiagramImpl#getCmmnElementRef <em>Cmmn Element Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMMNDiagramImpl extends DiagramImpl implements CMMNDiagram {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension size;

	/**
	 * The cached value of the '{@link #getCMMNDiagramElementGroup() <em>CMMN Diagram Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMMNDiagramElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap cMMNDiagramElementGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMMNDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNDIPackage.Literals.CMMN_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Dimension newSize, NotificationChain msgs) {
		Dimension oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_DIAGRAM__SIZE, oldSize, newSize);
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
	public void setSize(Dimension newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNDIPackage.CMMN_DIAGRAM__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNDIPackage.CMMN_DIAGRAM__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_DIAGRAM__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCMMNDiagramElementGroup() {
		if (cMMNDiagramElementGroup == null) {
			cMMNDiagramElementGroup = new BasicFeatureMap(this, CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP);
		}
		return cMMNDiagramElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiagramElement> getCMMNDiagramElement() {
		return getCMMNDiagramElementGroup().list(CMMNDIPackage.Literals.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT_REF, oldCmmnElementRef, cmmnElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNDIPackage.CMMN_DIAGRAM__SIZE:
				return basicSetSize(null, msgs);
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP:
				return ((InternalEList<?>)getCMMNDiagramElementGroup()).basicRemove(otherEnd, msgs);
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT:
				return ((InternalEList<?>)getCMMNDiagramElement()).basicRemove(otherEnd, msgs);
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
			case CMMNDIPackage.CMMN_DIAGRAM__SIZE:
				return getSize();
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP:
				if (coreType) return getCMMNDiagramElementGroup();
				return ((FeatureMap.Internal)getCMMNDiagramElementGroup()).getWrapper();
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT:
				return getCMMNDiagramElement();
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT_REF:
				return getCmmnElementRef();
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
			case CMMNDIPackage.CMMN_DIAGRAM__SIZE:
				setSize((Dimension)newValue);
				return;
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP:
				((FeatureMap.Internal)getCMMNDiagramElementGroup()).set(newValue);
				return;
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT:
				getCMMNDiagramElement().clear();
				getCMMNDiagramElement().addAll((Collection<? extends DiagramElement>)newValue);
				return;
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT_REF:
				setCmmnElementRef((QName)newValue);
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
			case CMMNDIPackage.CMMN_DIAGRAM__SIZE:
				setSize((Dimension)null);
				return;
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP:
				getCMMNDiagramElementGroup().clear();
				return;
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT:
				getCMMNDiagramElement().clear();
				return;
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT_REF:
				setCmmnElementRef(CMMN_ELEMENT_REF_EDEFAULT);
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
			case CMMNDIPackage.CMMN_DIAGRAM__SIZE:
				return size != null;
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT_GROUP:
				return cMMNDiagramElementGroup != null && !cMMNDiagramElementGroup.isEmpty();
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_DIAGRAM_ELEMENT:
				return !getCMMNDiagramElement().isEmpty();
			case CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT_REF:
				return CMMN_ELEMENT_REF_EDEFAULT == null ? cmmnElementRef != null : !CMMN_ELEMENT_REF_EDEFAULT.equals(cmmnElementRef);
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
		result.append(" (cMMNDiagramElementGroup: ");
		result.append(cMMNDiagramElementGroup);
		result.append(", cmmnElementRef: ");
		result.append(cmmnElementRef);
		result.append(')');
		return result.toString();
	}

} //CMMNDiagramImpl
