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
package org.omg.bpmn.di.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.bpmn.bpmn2.BaseElement;

import org.omg.bpmn.di.BPMNEdge;
import org.omg.bpmn.di.BPMNPlane;
import org.omg.bpmn.di.BPMNShape;
import org.omg.bpmn.di.BpmnDiPackage;

import org.omg.dd.di.impl.PlaneImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNPlaneImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNPlaneImpl#getBpmnShape <em>Bpmn Shape</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNPlaneImpl#getBpmnEdge <em>Bpmn Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNPlaneImpl extends PlaneImpl implements BPMNPlane {
	/**
	 * The cached value of the '{@link #getBpmnElement() <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmnElement()
	 * @generated
	 * @ordered
	 */
	protected BaseElement bpmnElement;

	/**
	 * The cached value of the '{@link #getBpmnShape() <em>Bpmn Shape</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmnShape()
	 * @generated
	 * @ordered
	 */
	protected EList<BPMNShape> bpmnShape;

	/**
	 * The cached value of the '{@link #getBpmnEdge() <em>Bpmn Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmnEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<BPMNEdge> bpmnEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNPlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.BPMN_PLANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseElement getBpmnElement() {
		if (bpmnElement != null && bpmnElement.eIsProxy()) {
			InternalEObject oldBpmnElement = (InternalEObject)bpmnElement;
			bpmnElement = (BaseElement)eResolveProxy(oldBpmnElement);
			if (bpmnElement != oldBpmnElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT, oldBpmnElement, bpmnElement));
			}
		}
		return bpmnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetBpmnElement() {
		return bpmnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBpmnElement(BaseElement newBpmnElement) {
		BaseElement oldBpmnElement = bpmnElement;
		bpmnElement = newBpmnElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT, oldBpmnElement, bpmnElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BPMNShape> getBpmnShape() {
		if (bpmnShape == null) {
			bpmnShape = new EObjectContainmentEList<BPMNShape>(BPMNShape.class, this, BpmnDiPackage.BPMN_PLANE__BPMN_SHAPE);
		}
		return bpmnShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BPMNEdge> getBpmnEdge() {
		if (bpmnEdge == null) {
			bpmnEdge = new EObjectContainmentEList<BPMNEdge>(BPMNEdge.class, this, BpmnDiPackage.BPMN_PLANE__BPMN_EDGE);
		}
		return bpmnEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnDiPackage.BPMN_PLANE__BPMN_SHAPE:
				return ((InternalEList<?>)getBpmnShape()).basicRemove(otherEnd, msgs);
			case BpmnDiPackage.BPMN_PLANE__BPMN_EDGE:
				return ((InternalEList<?>)getBpmnEdge()).basicRemove(otherEnd, msgs);
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
			case BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
				if (resolve) return getBpmnElement();
				return basicGetBpmnElement();
			case BpmnDiPackage.BPMN_PLANE__BPMN_SHAPE:
				return getBpmnShape();
			case BpmnDiPackage.BPMN_PLANE__BPMN_EDGE:
				return getBpmnEdge();
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
			case BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
				setBpmnElement((BaseElement)newValue);
				return;
			case BpmnDiPackage.BPMN_PLANE__BPMN_SHAPE:
				getBpmnShape().clear();
				getBpmnShape().addAll((Collection<? extends BPMNShape>)newValue);
				return;
			case BpmnDiPackage.BPMN_PLANE__BPMN_EDGE:
				getBpmnEdge().clear();
				getBpmnEdge().addAll((Collection<? extends BPMNEdge>)newValue);
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
			case BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
				setBpmnElement((BaseElement)null);
				return;
			case BpmnDiPackage.BPMN_PLANE__BPMN_SHAPE:
				getBpmnShape().clear();
				return;
			case BpmnDiPackage.BPMN_PLANE__BPMN_EDGE:
				getBpmnEdge().clear();
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
			case BpmnDiPackage.BPMN_PLANE__BPMN_ELEMENT:
				return bpmnElement != null;
			case BpmnDiPackage.BPMN_PLANE__BPMN_SHAPE:
				return bpmnShape != null && !bpmnShape.isEmpty();
			case BpmnDiPackage.BPMN_PLANE__BPMN_EDGE:
				return bpmnEdge != null && !bpmnEdge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BPMNPlaneImpl
