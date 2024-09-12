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

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.DSAssociationTypeCodePropertyType;
import org.isotc211._2005.gmd.DSInitiativeTypeCodePropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDAggregateInformationType;
import org.isotc211._2005.gmd.MDIdentifierPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Aggregate Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDAggregateInformationTypeImpl#getAggregateDataSetName <em>Aggregate Data Set Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDAggregateInformationTypeImpl#getAggregateDataSetIdentifier <em>Aggregate Data Set Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDAggregateInformationTypeImpl#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDAggregateInformationTypeImpl#getInitiativeType <em>Initiative Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDAggregateInformationTypeImpl extends AbstractObjectTypeImpl implements MDAggregateInformationType {
	/**
	 * The cached value of the '{@link #getAggregateDataSetName() <em>Aggregate Data Set Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateDataSetName()
	 * @generated
	 * @ordered
	 */
	protected CICitationPropertyType aggregateDataSetName;

	/**
	 * The cached value of the '{@link #getAggregateDataSetIdentifier() <em>Aggregate Data Set Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateDataSetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected MDIdentifierPropertyType aggregateDataSetIdentifier;

	/**
	 * The cached value of the '{@link #getAssociationType() <em>Association Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected DSAssociationTypeCodePropertyType associationType;

	/**
	 * The cached value of the '{@link #getInitiativeType() <em>Initiative Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiativeType()
	 * @generated
	 * @ordered
	 */
	protected DSInitiativeTypeCodePropertyType initiativeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDAggregateInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDAggregateInformationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationPropertyType getAggregateDataSetName() {
		return aggregateDataSetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateDataSetName(CICitationPropertyType newAggregateDataSetName, NotificationChain msgs) {
		CICitationPropertyType oldAggregateDataSetName = aggregateDataSetName;
		aggregateDataSetName = newAggregateDataSetName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME, oldAggregateDataSetName, newAggregateDataSetName);
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
	public void setAggregateDataSetName(CICitationPropertyType newAggregateDataSetName) {
		if (newAggregateDataSetName != aggregateDataSetName) {
			NotificationChain msgs = null;
			if (aggregateDataSetName != null)
				msgs = ((InternalEObject)aggregateDataSetName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME, null, msgs);
			if (newAggregateDataSetName != null)
				msgs = ((InternalEObject)newAggregateDataSetName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME, null, msgs);
			msgs = basicSetAggregateDataSetName(newAggregateDataSetName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME, newAggregateDataSetName, newAggregateDataSetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentifierPropertyType getAggregateDataSetIdentifier() {
		return aggregateDataSetIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateDataSetIdentifier(MDIdentifierPropertyType newAggregateDataSetIdentifier, NotificationChain msgs) {
		MDIdentifierPropertyType oldAggregateDataSetIdentifier = aggregateDataSetIdentifier;
		aggregateDataSetIdentifier = newAggregateDataSetIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER, oldAggregateDataSetIdentifier, newAggregateDataSetIdentifier);
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
	public void setAggregateDataSetIdentifier(MDIdentifierPropertyType newAggregateDataSetIdentifier) {
		if (newAggregateDataSetIdentifier != aggregateDataSetIdentifier) {
			NotificationChain msgs = null;
			if (aggregateDataSetIdentifier != null)
				msgs = ((InternalEObject)aggregateDataSetIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER, null, msgs);
			if (newAggregateDataSetIdentifier != null)
				msgs = ((InternalEObject)newAggregateDataSetIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER, null, msgs);
			msgs = basicSetAggregateDataSetIdentifier(newAggregateDataSetIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER, newAggregateDataSetIdentifier, newAggregateDataSetIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSAssociationTypeCodePropertyType getAssociationType() {
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationType(DSAssociationTypeCodePropertyType newAssociationType, NotificationChain msgs) {
		DSAssociationTypeCodePropertyType oldAssociationType = associationType;
		associationType = newAssociationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE, oldAssociationType, newAssociationType);
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
	public void setAssociationType(DSAssociationTypeCodePropertyType newAssociationType) {
		if (newAssociationType != associationType) {
			NotificationChain msgs = null;
			if (associationType != null)
				msgs = ((InternalEObject)associationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE, null, msgs);
			if (newAssociationType != null)
				msgs = ((InternalEObject)newAssociationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE, null, msgs);
			msgs = basicSetAssociationType(newAssociationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE, newAssociationType, newAssociationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSInitiativeTypeCodePropertyType getInitiativeType() {
		return initiativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiativeType(DSInitiativeTypeCodePropertyType newInitiativeType, NotificationChain msgs) {
		DSInitiativeTypeCodePropertyType oldInitiativeType = initiativeType;
		initiativeType = newInitiativeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE, oldInitiativeType, newInitiativeType);
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
	public void setInitiativeType(DSInitiativeTypeCodePropertyType newInitiativeType) {
		if (newInitiativeType != initiativeType) {
			NotificationChain msgs = null;
			if (initiativeType != null)
				msgs = ((InternalEObject)initiativeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE, null, msgs);
			if (newInitiativeType != null)
				msgs = ((InternalEObject)newInitiativeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE, null, msgs);
			msgs = basicSetInitiativeType(newInitiativeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE, newInitiativeType, newInitiativeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME:
				return basicSetAggregateDataSetName(null, msgs);
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER:
				return basicSetAggregateDataSetIdentifier(null, msgs);
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE:
				return basicSetAssociationType(null, msgs);
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE:
				return basicSetInitiativeType(null, msgs);
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
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME:
				return getAggregateDataSetName();
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER:
				return getAggregateDataSetIdentifier();
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE:
				return getAssociationType();
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE:
				return getInitiativeType();
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
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME:
				setAggregateDataSetName((CICitationPropertyType)newValue);
				return;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER:
				setAggregateDataSetIdentifier((MDIdentifierPropertyType)newValue);
				return;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE:
				setAssociationType((DSAssociationTypeCodePropertyType)newValue);
				return;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE:
				setInitiativeType((DSInitiativeTypeCodePropertyType)newValue);
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
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME:
				setAggregateDataSetName((CICitationPropertyType)null);
				return;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER:
				setAggregateDataSetIdentifier((MDIdentifierPropertyType)null);
				return;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE:
				setAssociationType((DSAssociationTypeCodePropertyType)null);
				return;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE:
				setInitiativeType((DSInitiativeTypeCodePropertyType)null);
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
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_NAME:
				return aggregateDataSetName != null;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__AGGREGATE_DATA_SET_IDENTIFIER:
				return aggregateDataSetIdentifier != null;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__ASSOCIATION_TYPE:
				return associationType != null;
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE__INITIATIVE_TYPE:
				return initiativeType != null;
		}
		return super.eIsSet(featureID);
	}

} //MDAggregateInformationTypeImpl
