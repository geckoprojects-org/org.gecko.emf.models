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
package net.opengis.gml.gml.impl;

import java.util.Collection;

import net.opengis.gml.gml.ArrayAssociationType;
import net.opengis.gml.gml.AssociationRoleType;
import net.opengis.gml.gml.BagType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bag Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.BagTypeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.BagTypeImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BagTypeImpl extends AbstractGMLTypeImpl implements BagType {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationRoleType> member;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected ArrayAssociationType members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BagTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getBagType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociationRoleType> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<AssociationRoleType>(AssociationRoleType.class, this, GMLPackage.BAG_TYPE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAssociationType getMembers() {
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembers(ArrayAssociationType newMembers, NotificationChain msgs) {
		ArrayAssociationType oldMembers = members;
		members = newMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.BAG_TYPE__MEMBERS, oldMembers, newMembers);
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
	public void setMembers(ArrayAssociationType newMembers) {
		if (newMembers != members) {
			NotificationChain msgs = null;
			if (members != null)
				msgs = ((InternalEObject)members).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.BAG_TYPE__MEMBERS, null, msgs);
			if (newMembers != null)
				msgs = ((InternalEObject)newMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.BAG_TYPE__MEMBERS, null, msgs);
			msgs = basicSetMembers(newMembers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.BAG_TYPE__MEMBERS, newMembers, newMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.BAG_TYPE__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case GMLPackage.BAG_TYPE__MEMBERS:
				return basicSetMembers(null, msgs);
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
			case GMLPackage.BAG_TYPE__MEMBER:
				return getMember();
			case GMLPackage.BAG_TYPE__MEMBERS:
				return getMembers();
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
			case GMLPackage.BAG_TYPE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends AssociationRoleType>)newValue);
				return;
			case GMLPackage.BAG_TYPE__MEMBERS:
				setMembers((ArrayAssociationType)newValue);
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
			case GMLPackage.BAG_TYPE__MEMBER:
				getMember().clear();
				return;
			case GMLPackage.BAG_TYPE__MEMBERS:
				setMembers((ArrayAssociationType)null);
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
			case GMLPackage.BAG_TYPE__MEMBER:
				return member != null && !member.isEmpty();
			case GMLPackage.BAG_TYPE__MEMBERS:
				return members != null;
		}
		return super.eIsSet(featureID);
	}

} //BagTypeImpl
