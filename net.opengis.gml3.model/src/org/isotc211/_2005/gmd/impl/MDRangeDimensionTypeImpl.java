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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.MemberNamePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDRangeDimensionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Range Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDRangeDimensionTypeImpl#getSequenceIdentifier <em>Sequence Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDRangeDimensionTypeImpl#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDRangeDimensionTypeImpl extends AbstractObjectTypeImpl implements MDRangeDimensionType {
	/**
	 * The cached value of the '{@link #getSequenceIdentifier() <em>Sequence Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected MemberNamePropertyType sequenceIdentifier;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType descriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDRangeDimensionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDRangeDimensionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberNamePropertyType getSequenceIdentifier() {
		return sequenceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceIdentifier(MemberNamePropertyType newSequenceIdentifier, NotificationChain msgs) {
		MemberNamePropertyType oldSequenceIdentifier = sequenceIdentifier;
		sequenceIdentifier = newSequenceIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER, oldSequenceIdentifier, newSequenceIdentifier);
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
	public void setSequenceIdentifier(MemberNamePropertyType newSequenceIdentifier) {
		if (newSequenceIdentifier != sequenceIdentifier) {
			NotificationChain msgs = null;
			if (sequenceIdentifier != null)
				msgs = ((InternalEObject)sequenceIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER, null, msgs);
			if (newSequenceIdentifier != null)
				msgs = ((InternalEObject)newSequenceIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER, null, msgs);
			msgs = basicSetSequenceIdentifier(newSequenceIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER, newSequenceIdentifier, newSequenceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptor(CharacterStringPropertyType newDescriptor, NotificationChain msgs) {
		CharacterStringPropertyType oldDescriptor = descriptor;
		descriptor = newDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR, oldDescriptor, newDescriptor);
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
	public void setDescriptor(CharacterStringPropertyType newDescriptor) {
		if (newDescriptor != descriptor) {
			NotificationChain msgs = null;
			if (descriptor != null)
				msgs = ((InternalEObject)descriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR, null, msgs);
			if (newDescriptor != null)
				msgs = ((InternalEObject)newDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR, null, msgs);
			msgs = basicSetDescriptor(newDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR, newDescriptor, newDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER:
				return basicSetSequenceIdentifier(null, msgs);
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR:
				return basicSetDescriptor(null, msgs);
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
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER:
				return getSequenceIdentifier();
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR:
				return getDescriptor();
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
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER:
				setSequenceIdentifier((MemberNamePropertyType)newValue);
				return;
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR:
				setDescriptor((CharacterStringPropertyType)newValue);
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
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER:
				setSequenceIdentifier((MemberNamePropertyType)null);
				return;
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR:
				setDescriptor((CharacterStringPropertyType)null);
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
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__SEQUENCE_IDENTIFIER:
				return sequenceIdentifier != null;
			case GMDPackage.MD_RANGE_DIMENSION_TYPE__DESCRIPTOR:
				return descriptor != null;
		}
		return super.eIsSet(featureID);
	}

} //MDRangeDimensionTypeImpl
