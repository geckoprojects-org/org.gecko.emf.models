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
package org.omg.spec.bpmn.bpmn.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TBaseElement;
import org.omg.spec.bpmn.bpmn.TLane;
import org.omg.spec.bpmn.bpmn.TLaneSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TLaneImpl#getPartitionElement <em>Partition Element</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TLaneImpl#getFlowNodeRef <em>Flow Node Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TLaneImpl#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TLaneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TLaneImpl#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLaneImpl extends TBaseElementImpl implements TLane {
	/**
	 * The cached value of the '{@link #getPartitionElement() <em>Partition Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionElement()
	 * @generated
	 * @ordered
	 */
	protected TBaseElement partitionElement;

	/**
	 * The cached value of the '{@link #getFlowNodeRef() <em>Flow Node Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowNodeRef()
	 * @generated
	 * @ordered
	 */
	protected EList<String> flowNodeRef;

	/**
	 * The cached value of the '{@link #getChildLaneSet() <em>Child Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildLaneSet()
	 * @generated
	 * @ordered
	 */
	protected TLaneSet childLaneSet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionElementRef() <em>Partition Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionElementRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName PARTITION_ELEMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionElementRef() <em>Partition Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionElementRef()
	 * @generated
	 * @ordered
	 */
	protected QName partitionElementRef = PARTITION_ELEMENT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTLane();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBaseElement getPartitionElement() {
		return partitionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionElement(TBaseElement newPartitionElement, NotificationChain msgs) {
		TBaseElement oldPartitionElement = partitionElement;
		partitionElement = newPartitionElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TLANE__PARTITION_ELEMENT, oldPartitionElement, newPartitionElement);
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
	public void setPartitionElement(TBaseElement newPartitionElement) {
		if (newPartitionElement != partitionElement) {
			NotificationChain msgs = null;
			if (partitionElement != null)
				msgs = ((InternalEObject)partitionElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TLANE__PARTITION_ELEMENT, null, msgs);
			if (newPartitionElement != null)
				msgs = ((InternalEObject)newPartitionElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TLANE__PARTITION_ELEMENT, null, msgs);
			msgs = basicSetPartitionElement(newPartitionElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TLANE__PARTITION_ELEMENT, newPartitionElement, newPartitionElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFlowNodeRef() {
		if (flowNodeRef == null) {
			flowNodeRef = new EDataTypeEList<String>(String.class, this, BPMNPackage.TLANE__FLOW_NODE_REF);
		}
		return flowNodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLaneSet getChildLaneSet() {
		return childLaneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildLaneSet(TLaneSet newChildLaneSet, NotificationChain msgs) {
		TLaneSet oldChildLaneSet = childLaneSet;
		childLaneSet = newChildLaneSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TLANE__CHILD_LANE_SET, oldChildLaneSet, newChildLaneSet);
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
	public void setChildLaneSet(TLaneSet newChildLaneSet) {
		if (newChildLaneSet != childLaneSet) {
			NotificationChain msgs = null;
			if (childLaneSet != null)
				msgs = ((InternalEObject)childLaneSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TLANE__CHILD_LANE_SET, null, msgs);
			if (newChildLaneSet != null)
				msgs = ((InternalEObject)newChildLaneSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TLANE__CHILD_LANE_SET, null, msgs);
			msgs = basicSetChildLaneSet(newChildLaneSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TLANE__CHILD_LANE_SET, newChildLaneSet, newChildLaneSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TLANE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getPartitionElementRef() {
		return partitionElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitionElementRef(QName newPartitionElementRef) {
		QName oldPartitionElementRef = partitionElementRef;
		partitionElementRef = newPartitionElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TLANE__PARTITION_ELEMENT_REF, oldPartitionElementRef, partitionElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TLANE__PARTITION_ELEMENT:
				return basicSetPartitionElement(null, msgs);
			case BPMNPackage.TLANE__CHILD_LANE_SET:
				return basicSetChildLaneSet(null, msgs);
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
			case BPMNPackage.TLANE__PARTITION_ELEMENT:
				return getPartitionElement();
			case BPMNPackage.TLANE__FLOW_NODE_REF:
				return getFlowNodeRef();
			case BPMNPackage.TLANE__CHILD_LANE_SET:
				return getChildLaneSet();
			case BPMNPackage.TLANE__NAME:
				return getName();
			case BPMNPackage.TLANE__PARTITION_ELEMENT_REF:
				return getPartitionElementRef();
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
			case BPMNPackage.TLANE__PARTITION_ELEMENT:
				setPartitionElement((TBaseElement)newValue);
				return;
			case BPMNPackage.TLANE__FLOW_NODE_REF:
				getFlowNodeRef().clear();
				getFlowNodeRef().addAll((Collection<? extends String>)newValue);
				return;
			case BPMNPackage.TLANE__CHILD_LANE_SET:
				setChildLaneSet((TLaneSet)newValue);
				return;
			case BPMNPackage.TLANE__NAME:
				setName((String)newValue);
				return;
			case BPMNPackage.TLANE__PARTITION_ELEMENT_REF:
				setPartitionElementRef((QName)newValue);
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
			case BPMNPackage.TLANE__PARTITION_ELEMENT:
				setPartitionElement((TBaseElement)null);
				return;
			case BPMNPackage.TLANE__FLOW_NODE_REF:
				getFlowNodeRef().clear();
				return;
			case BPMNPackage.TLANE__CHILD_LANE_SET:
				setChildLaneSet((TLaneSet)null);
				return;
			case BPMNPackage.TLANE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMNPackage.TLANE__PARTITION_ELEMENT_REF:
				setPartitionElementRef(PARTITION_ELEMENT_REF_EDEFAULT);
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
			case BPMNPackage.TLANE__PARTITION_ELEMENT:
				return partitionElement != null;
			case BPMNPackage.TLANE__FLOW_NODE_REF:
				return flowNodeRef != null && !flowNodeRef.isEmpty();
			case BPMNPackage.TLANE__CHILD_LANE_SET:
				return childLaneSet != null;
			case BPMNPackage.TLANE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMNPackage.TLANE__PARTITION_ELEMENT_REF:
				return PARTITION_ELEMENT_REF_EDEFAULT == null ? partitionElementRef != null : !PARTITION_ELEMENT_REF_EDEFAULT.equals(partitionElementRef);
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
		result.append(" (flowNodeRef: ");
		result.append(flowNodeRef);
		result.append(", name: ");
		result.append(name);
		result.append(", partitionElementRef: ");
		result.append(partitionElementRef);
		result.append(')');
		return result.toString();
	}

} //TLaneImpl
