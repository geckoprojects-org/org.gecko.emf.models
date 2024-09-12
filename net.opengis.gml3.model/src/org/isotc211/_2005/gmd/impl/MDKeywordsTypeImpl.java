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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDKeywordTypeCodePropertyType;
import org.isotc211._2005.gmd.MDKeywordsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Keywords Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDKeywordsTypeImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDKeywordsTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDKeywordsTypeImpl#getThesaurusName <em>Thesaurus Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDKeywordsTypeImpl extends AbstractObjectTypeImpl implements MDKeywordsType {
	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> keyword;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MDKeywordTypeCodePropertyType type;

	/**
	 * The cached value of the '{@link #getThesaurusName() <em>Thesaurus Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesaurusName()
	 * @generated
	 * @ordered
	 */
	protected CICitationPropertyType thesaurusName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDKeywordsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDKeywordsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getKeyword() {
		if (keyword == null) {
			keyword = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_KEYWORDS_TYPE__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDKeywordTypeCodePropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(MDKeywordTypeCodePropertyType newType, NotificationChain msgs) {
		MDKeywordTypeCodePropertyType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_KEYWORDS_TYPE__TYPE, oldType, newType);
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
	public void setType(MDKeywordTypeCodePropertyType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_KEYWORDS_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_KEYWORDS_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_KEYWORDS_TYPE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationPropertyType getThesaurusName() {
		return thesaurusName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThesaurusName(CICitationPropertyType newThesaurusName, NotificationChain msgs) {
		CICitationPropertyType oldThesaurusName = thesaurusName;
		thesaurusName = newThesaurusName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME, oldThesaurusName, newThesaurusName);
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
	public void setThesaurusName(CICitationPropertyType newThesaurusName) {
		if (newThesaurusName != thesaurusName) {
			NotificationChain msgs = null;
			if (thesaurusName != null)
				msgs = ((InternalEObject)thesaurusName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME, null, msgs);
			if (newThesaurusName != null)
				msgs = ((InternalEObject)newThesaurusName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME, null, msgs);
			msgs = basicSetThesaurusName(newThesaurusName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME, newThesaurusName, newThesaurusName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_KEYWORDS_TYPE__KEYWORD:
				return ((InternalEList<?>)getKeyword()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_KEYWORDS_TYPE__TYPE:
				return basicSetType(null, msgs);
			case GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME:
				return basicSetThesaurusName(null, msgs);
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
			case GMDPackage.MD_KEYWORDS_TYPE__KEYWORD:
				return getKeyword();
			case GMDPackage.MD_KEYWORDS_TYPE__TYPE:
				return getType();
			case GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME:
				return getThesaurusName();
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
			case GMDPackage.MD_KEYWORDS_TYPE__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.MD_KEYWORDS_TYPE__TYPE:
				setType((MDKeywordTypeCodePropertyType)newValue);
				return;
			case GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME:
				setThesaurusName((CICitationPropertyType)newValue);
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
			case GMDPackage.MD_KEYWORDS_TYPE__KEYWORD:
				getKeyword().clear();
				return;
			case GMDPackage.MD_KEYWORDS_TYPE__TYPE:
				setType((MDKeywordTypeCodePropertyType)null);
				return;
			case GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME:
				setThesaurusName((CICitationPropertyType)null);
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
			case GMDPackage.MD_KEYWORDS_TYPE__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case GMDPackage.MD_KEYWORDS_TYPE__TYPE:
				return type != null;
			case GMDPackage.MD_KEYWORDS_TYPE__THESAURUS_NAME:
				return thesaurusName != null;
		}
		return super.eIsSet(featureID);
	}

} //MDKeywordsTypeImpl
