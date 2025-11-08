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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ConsiderationsType;
import org.cyclonedx.schema.bom.EnvironmentalConsiderationsType;
import org.cyclonedx.schema.bom.EthicalConsiderationsType;
import org.cyclonedx.schema.bom.FairnessAssessmentsType;
import org.cyclonedx.schema.bom.PerformanceTradeoffsType;
import org.cyclonedx.schema.bom.TechnicalLimitationsType;
import org.cyclonedx.schema.bom.UseCasesType;
import org.cyclonedx.schema.bom.UsersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Considerations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl#getTechnicalLimitations <em>Technical Limitations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl#getPerformanceTradeoffs <em>Performance Tradeoffs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl#getEthicalConsiderations <em>Ethical Considerations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl#getEnvironmentalConsiderations <em>Environmental Considerations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ConsiderationsTypeImpl#getFairnessAssessments <em>Fairness Assessments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsiderationsTypeImpl extends MinimalEObjectImpl.Container implements ConsiderationsType {
	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected UsersType users;

	/**
	 * The cached value of the '{@link #getUseCases() <em>Use Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCases()
	 * @generated
	 * @ordered
	 */
	protected UseCasesType useCases;

	/**
	 * The cached value of the '{@link #getTechnicalLimitations() <em>Technical Limitations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalLimitations()
	 * @generated
	 * @ordered
	 */
	protected TechnicalLimitationsType technicalLimitations;

	/**
	 * The cached value of the '{@link #getPerformanceTradeoffs() <em>Performance Tradeoffs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceTradeoffs()
	 * @generated
	 * @ordered
	 */
	protected PerformanceTradeoffsType performanceTradeoffs;

	/**
	 * The cached value of the '{@link #getEthicalConsiderations() <em>Ethical Considerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthicalConsiderations()
	 * @generated
	 * @ordered
	 */
	protected EthicalConsiderationsType ethicalConsiderations;

	/**
	 * The cached value of the '{@link #getEnvironmentalConsiderations() <em>Environmental Considerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalConsiderations()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentalConsiderationsType environmentalConsiderations;

	/**
	 * The cached value of the '{@link #getFairnessAssessments() <em>Fairness Assessments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFairnessAssessments()
	 * @generated
	 * @ordered
	 */
	protected FairnessAssessmentsType fairnessAssessments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsiderationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getConsiderationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsersType getUsers() {
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsers(UsersType newUsers, NotificationChain msgs) {
		UsersType oldUsers = users;
		users = newUsers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__USERS, oldUsers, newUsers);
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
	public void setUsers(UsersType newUsers) {
		if (newUsers != users) {
			NotificationChain msgs = null;
			if (users != null)
				msgs = ((InternalEObject)users).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__USERS, null, msgs);
			if (newUsers != null)
				msgs = ((InternalEObject)newUsers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__USERS, null, msgs);
			msgs = basicSetUsers(newUsers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__USERS, newUsers, newUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCasesType getUseCases() {
		return useCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCases(UseCasesType newUseCases, NotificationChain msgs) {
		UseCasesType oldUseCases = useCases;
		useCases = newUseCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__USE_CASES, oldUseCases, newUseCases);
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
	public void setUseCases(UseCasesType newUseCases) {
		if (newUseCases != useCases) {
			NotificationChain msgs = null;
			if (useCases != null)
				msgs = ((InternalEObject)useCases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__USE_CASES, null, msgs);
			if (newUseCases != null)
				msgs = ((InternalEObject)newUseCases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__USE_CASES, null, msgs);
			msgs = basicSetUseCases(newUseCases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__USE_CASES, newUseCases, newUseCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnicalLimitationsType getTechnicalLimitations() {
		return technicalLimitations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnicalLimitations(TechnicalLimitationsType newTechnicalLimitations, NotificationChain msgs) {
		TechnicalLimitationsType oldTechnicalLimitations = technicalLimitations;
		technicalLimitations = newTechnicalLimitations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS, oldTechnicalLimitations, newTechnicalLimitations);
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
	public void setTechnicalLimitations(TechnicalLimitationsType newTechnicalLimitations) {
		if (newTechnicalLimitations != technicalLimitations) {
			NotificationChain msgs = null;
			if (technicalLimitations != null)
				msgs = ((InternalEObject)technicalLimitations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS, null, msgs);
			if (newTechnicalLimitations != null)
				msgs = ((InternalEObject)newTechnicalLimitations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS, null, msgs);
			msgs = basicSetTechnicalLimitations(newTechnicalLimitations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS, newTechnicalLimitations, newTechnicalLimitations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceTradeoffsType getPerformanceTradeoffs() {
		return performanceTradeoffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceTradeoffs(PerformanceTradeoffsType newPerformanceTradeoffs, NotificationChain msgs) {
		PerformanceTradeoffsType oldPerformanceTradeoffs = performanceTradeoffs;
		performanceTradeoffs = newPerformanceTradeoffs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS, oldPerformanceTradeoffs, newPerformanceTradeoffs);
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
	public void setPerformanceTradeoffs(PerformanceTradeoffsType newPerformanceTradeoffs) {
		if (newPerformanceTradeoffs != performanceTradeoffs) {
			NotificationChain msgs = null;
			if (performanceTradeoffs != null)
				msgs = ((InternalEObject)performanceTradeoffs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS, null, msgs);
			if (newPerformanceTradeoffs != null)
				msgs = ((InternalEObject)newPerformanceTradeoffs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS, null, msgs);
			msgs = basicSetPerformanceTradeoffs(newPerformanceTradeoffs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS, newPerformanceTradeoffs, newPerformanceTradeoffs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EthicalConsiderationsType getEthicalConsiderations() {
		return ethicalConsiderations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEthicalConsiderations(EthicalConsiderationsType newEthicalConsiderations, NotificationChain msgs) {
		EthicalConsiderationsType oldEthicalConsiderations = ethicalConsiderations;
		ethicalConsiderations = newEthicalConsiderations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS, oldEthicalConsiderations, newEthicalConsiderations);
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
	public void setEthicalConsiderations(EthicalConsiderationsType newEthicalConsiderations) {
		if (newEthicalConsiderations != ethicalConsiderations) {
			NotificationChain msgs = null;
			if (ethicalConsiderations != null)
				msgs = ((InternalEObject)ethicalConsiderations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS, null, msgs);
			if (newEthicalConsiderations != null)
				msgs = ((InternalEObject)newEthicalConsiderations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS, null, msgs);
			msgs = basicSetEthicalConsiderations(newEthicalConsiderations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS, newEthicalConsiderations, newEthicalConsiderations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentalConsiderationsType getEnvironmentalConsiderations() {
		return environmentalConsiderations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentalConsiderations(EnvironmentalConsiderationsType newEnvironmentalConsiderations, NotificationChain msgs) {
		EnvironmentalConsiderationsType oldEnvironmentalConsiderations = environmentalConsiderations;
		environmentalConsiderations = newEnvironmentalConsiderations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS, oldEnvironmentalConsiderations, newEnvironmentalConsiderations);
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
	public void setEnvironmentalConsiderations(EnvironmentalConsiderationsType newEnvironmentalConsiderations) {
		if (newEnvironmentalConsiderations != environmentalConsiderations) {
			NotificationChain msgs = null;
			if (environmentalConsiderations != null)
				msgs = ((InternalEObject)environmentalConsiderations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS, null, msgs);
			if (newEnvironmentalConsiderations != null)
				msgs = ((InternalEObject)newEnvironmentalConsiderations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS, null, msgs);
			msgs = basicSetEnvironmentalConsiderations(newEnvironmentalConsiderations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS, newEnvironmentalConsiderations, newEnvironmentalConsiderations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FairnessAssessmentsType getFairnessAssessments() {
		return fairnessAssessments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFairnessAssessments(FairnessAssessmentsType newFairnessAssessments, NotificationChain msgs) {
		FairnessAssessmentsType oldFairnessAssessments = fairnessAssessments;
		fairnessAssessments = newFairnessAssessments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS, oldFairnessAssessments, newFairnessAssessments);
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
	public void setFairnessAssessments(FairnessAssessmentsType newFairnessAssessments) {
		if (newFairnessAssessments != fairnessAssessments) {
			NotificationChain msgs = null;
			if (fairnessAssessments != null)
				msgs = ((InternalEObject)fairnessAssessments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS, null, msgs);
			if (newFairnessAssessments != null)
				msgs = ((InternalEObject)newFairnessAssessments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS, null, msgs);
			msgs = basicSetFairnessAssessments(newFairnessAssessments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS, newFairnessAssessments, newFairnessAssessments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.CONSIDERATIONS_TYPE__USERS:
				return basicSetUsers(null, msgs);
			case BOMPackage.CONSIDERATIONS_TYPE__USE_CASES:
				return basicSetUseCases(null, msgs);
			case BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS:
				return basicSetTechnicalLimitations(null, msgs);
			case BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS:
				return basicSetPerformanceTradeoffs(null, msgs);
			case BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS:
				return basicSetEthicalConsiderations(null, msgs);
			case BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS:
				return basicSetEnvironmentalConsiderations(null, msgs);
			case BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS:
				return basicSetFairnessAssessments(null, msgs);
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
			case BOMPackage.CONSIDERATIONS_TYPE__USERS:
				return getUsers();
			case BOMPackage.CONSIDERATIONS_TYPE__USE_CASES:
				return getUseCases();
			case BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS:
				return getTechnicalLimitations();
			case BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS:
				return getPerformanceTradeoffs();
			case BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS:
				return getEthicalConsiderations();
			case BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS:
				return getEnvironmentalConsiderations();
			case BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS:
				return getFairnessAssessments();
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
			case BOMPackage.CONSIDERATIONS_TYPE__USERS:
				setUsers((UsersType)newValue);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__USE_CASES:
				setUseCases((UseCasesType)newValue);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS:
				setTechnicalLimitations((TechnicalLimitationsType)newValue);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS:
				setPerformanceTradeoffs((PerformanceTradeoffsType)newValue);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS:
				setEthicalConsiderations((EthicalConsiderationsType)newValue);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS:
				setEnvironmentalConsiderations((EnvironmentalConsiderationsType)newValue);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS:
				setFairnessAssessments((FairnessAssessmentsType)newValue);
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
			case BOMPackage.CONSIDERATIONS_TYPE__USERS:
				setUsers((UsersType)null);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__USE_CASES:
				setUseCases((UseCasesType)null);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS:
				setTechnicalLimitations((TechnicalLimitationsType)null);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS:
				setPerformanceTradeoffs((PerformanceTradeoffsType)null);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS:
				setEthicalConsiderations((EthicalConsiderationsType)null);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS:
				setEnvironmentalConsiderations((EnvironmentalConsiderationsType)null);
				return;
			case BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS:
				setFairnessAssessments((FairnessAssessmentsType)null);
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
			case BOMPackage.CONSIDERATIONS_TYPE__USERS:
				return users != null;
			case BOMPackage.CONSIDERATIONS_TYPE__USE_CASES:
				return useCases != null;
			case BOMPackage.CONSIDERATIONS_TYPE__TECHNICAL_LIMITATIONS:
				return technicalLimitations != null;
			case BOMPackage.CONSIDERATIONS_TYPE__PERFORMANCE_TRADEOFFS:
				return performanceTradeoffs != null;
			case BOMPackage.CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATIONS:
				return ethicalConsiderations != null;
			case BOMPackage.CONSIDERATIONS_TYPE__ENVIRONMENTAL_CONSIDERATIONS:
				return environmentalConsiderations != null;
			case BOMPackage.CONSIDERATIONS_TYPE__FAIRNESS_ASSESSMENTS:
				return fairnessAssessments != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsiderationsTypeImpl
