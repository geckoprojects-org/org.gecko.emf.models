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

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CISeriesType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Series Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.CISeriesTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CISeriesTypeImpl#getIssueIdentification <em>Issue Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CISeriesTypeImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CISeriesTypeImpl extends AbstractObjectTypeImpl implements CISeriesType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType name;

	/**
	 * The cached value of the '{@link #getIssueIdentification() <em>Issue Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueIdentification()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType issueIdentification;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CISeriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getCISeriesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CharacterStringPropertyType newName, NotificationChain msgs) {
		CharacterStringPropertyType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_SERIES_TYPE__NAME, oldName, newName);
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
	public void setName(CharacterStringPropertyType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_SERIES_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_SERIES_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_SERIES_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getIssueIdentification() {
		return issueIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueIdentification(CharacterStringPropertyType newIssueIdentification, NotificationChain msgs) {
		CharacterStringPropertyType oldIssueIdentification = issueIdentification;
		issueIdentification = newIssueIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION, oldIssueIdentification, newIssueIdentification);
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
	public void setIssueIdentification(CharacterStringPropertyType newIssueIdentification) {
		if (newIssueIdentification != issueIdentification) {
			NotificationChain msgs = null;
			if (issueIdentification != null)
				msgs = ((InternalEObject)issueIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION, null, msgs);
			if (newIssueIdentification != null)
				msgs = ((InternalEObject)newIssueIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION, null, msgs);
			msgs = basicSetIssueIdentification(newIssueIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION, newIssueIdentification, newIssueIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(CharacterStringPropertyType newPage, NotificationChain msgs) {
		CharacterStringPropertyType oldPage = page;
		page = newPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_SERIES_TYPE__PAGE, oldPage, newPage);
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
	public void setPage(CharacterStringPropertyType newPage) {
		if (newPage != page) {
			NotificationChain msgs = null;
			if (page != null)
				msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_SERIES_TYPE__PAGE, null, msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_SERIES_TYPE__PAGE, null, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_SERIES_TYPE__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.CI_SERIES_TYPE__NAME:
				return basicSetName(null, msgs);
			case GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION:
				return basicSetIssueIdentification(null, msgs);
			case GMDPackage.CI_SERIES_TYPE__PAGE:
				return basicSetPage(null, msgs);
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
			case GMDPackage.CI_SERIES_TYPE__NAME:
				return getName();
			case GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION:
				return getIssueIdentification();
			case GMDPackage.CI_SERIES_TYPE__PAGE:
				return getPage();
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
			case GMDPackage.CI_SERIES_TYPE__NAME:
				setName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION:
				setIssueIdentification((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_SERIES_TYPE__PAGE:
				setPage((CharacterStringPropertyType)newValue);
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
			case GMDPackage.CI_SERIES_TYPE__NAME:
				setName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION:
				setIssueIdentification((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_SERIES_TYPE__PAGE:
				setPage((CharacterStringPropertyType)null);
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
			case GMDPackage.CI_SERIES_TYPE__NAME:
				return name != null;
			case GMDPackage.CI_SERIES_TYPE__ISSUE_IDENTIFICATION:
				return issueIdentification != null;
			case GMDPackage.CI_SERIES_TYPE__PAGE:
				return page != null;
		}
		return super.eIsSet(featureID);
	}

} //CISeriesTypeImpl
