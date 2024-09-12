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

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDDistributorPropertyType;
import org.isotc211._2005.gmd.MDFormatType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Format Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFormatTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFormatTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFormatTypeImpl#getAmendmentNumber <em>Amendment Number</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFormatTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFormatTypeImpl#getFileDecompressionTechnique <em>File Decompression Technique</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDFormatTypeImpl#getFormatDistributor <em>Format Distributor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDFormatTypeImpl extends AbstractObjectTypeImpl implements MDFormatType {
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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType version;

	/**
	 * The cached value of the '{@link #getAmendmentNumber() <em>Amendment Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmendmentNumber()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType amendmentNumber;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType specification;

	/**
	 * The cached value of the '{@link #getFileDecompressionTechnique() <em>File Decompression Technique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileDecompressionTechnique()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType fileDecompressionTechnique;

	/**
	 * The cached value of the '{@link #getFormatDistributor() <em>Format Distributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatDistributor()
	 * @generated
	 * @ordered
	 */
	protected EList<MDDistributorPropertyType> formatDistributor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDFormatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDFormatType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(CharacterStringPropertyType newVersion, NotificationChain msgs) {
		CharacterStringPropertyType oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__VERSION, oldVersion, newVersion);
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
	public void setVersion(CharacterStringPropertyType newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getAmendmentNumber() {
		return amendmentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmendmentNumber(CharacterStringPropertyType newAmendmentNumber, NotificationChain msgs) {
		CharacterStringPropertyType oldAmendmentNumber = amendmentNumber;
		amendmentNumber = newAmendmentNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER, oldAmendmentNumber, newAmendmentNumber);
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
	public void setAmendmentNumber(CharacterStringPropertyType newAmendmentNumber) {
		if (newAmendmentNumber != amendmentNumber) {
			NotificationChain msgs = null;
			if (amendmentNumber != null)
				msgs = ((InternalEObject)amendmentNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER, null, msgs);
			if (newAmendmentNumber != null)
				msgs = ((InternalEObject)newAmendmentNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER, null, msgs);
			msgs = basicSetAmendmentNumber(newAmendmentNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER, newAmendmentNumber, newAmendmentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(CharacterStringPropertyType newSpecification, NotificationChain msgs) {
		CharacterStringPropertyType oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__SPECIFICATION, oldSpecification, newSpecification);
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
	public void setSpecification(CharacterStringPropertyType newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getFileDecompressionTechnique() {
		return fileDecompressionTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileDecompressionTechnique(CharacterStringPropertyType newFileDecompressionTechnique, NotificationChain msgs) {
		CharacterStringPropertyType oldFileDecompressionTechnique = fileDecompressionTechnique;
		fileDecompressionTechnique = newFileDecompressionTechnique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE, oldFileDecompressionTechnique, newFileDecompressionTechnique);
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
	public void setFileDecompressionTechnique(CharacterStringPropertyType newFileDecompressionTechnique) {
		if (newFileDecompressionTechnique != fileDecompressionTechnique) {
			NotificationChain msgs = null;
			if (fileDecompressionTechnique != null)
				msgs = ((InternalEObject)fileDecompressionTechnique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE, null, msgs);
			if (newFileDecompressionTechnique != null)
				msgs = ((InternalEObject)newFileDecompressionTechnique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE, null, msgs);
			msgs = basicSetFileDecompressionTechnique(newFileDecompressionTechnique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE, newFileDecompressionTechnique, newFileDecompressionTechnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDDistributorPropertyType> getFormatDistributor() {
		if (formatDistributor == null) {
			formatDistributor = new EObjectContainmentEList<MDDistributorPropertyType>(MDDistributorPropertyType.class, this, GMDPackage.MD_FORMAT_TYPE__FORMAT_DISTRIBUTOR);
		}
		return formatDistributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_FORMAT_TYPE__NAME:
				return basicSetName(null, msgs);
			case GMDPackage.MD_FORMAT_TYPE__VERSION:
				return basicSetVersion(null, msgs);
			case GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER:
				return basicSetAmendmentNumber(null, msgs);
			case GMDPackage.MD_FORMAT_TYPE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE:
				return basicSetFileDecompressionTechnique(null, msgs);
			case GMDPackage.MD_FORMAT_TYPE__FORMAT_DISTRIBUTOR:
				return ((InternalEList<?>)getFormatDistributor()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_FORMAT_TYPE__NAME:
				return getName();
			case GMDPackage.MD_FORMAT_TYPE__VERSION:
				return getVersion();
			case GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER:
				return getAmendmentNumber();
			case GMDPackage.MD_FORMAT_TYPE__SPECIFICATION:
				return getSpecification();
			case GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE:
				return getFileDecompressionTechnique();
			case GMDPackage.MD_FORMAT_TYPE__FORMAT_DISTRIBUTOR:
				return getFormatDistributor();
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
			case GMDPackage.MD_FORMAT_TYPE__NAME:
				setName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_FORMAT_TYPE__VERSION:
				setVersion((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER:
				setAmendmentNumber((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_FORMAT_TYPE__SPECIFICATION:
				setSpecification((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE:
				setFileDecompressionTechnique((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_FORMAT_TYPE__FORMAT_DISTRIBUTOR:
				getFormatDistributor().clear();
				getFormatDistributor().addAll((Collection<? extends MDDistributorPropertyType>)newValue);
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
			case GMDPackage.MD_FORMAT_TYPE__NAME:
				setName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_FORMAT_TYPE__VERSION:
				setVersion((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER:
				setAmendmentNumber((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_FORMAT_TYPE__SPECIFICATION:
				setSpecification((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE:
				setFileDecompressionTechnique((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_FORMAT_TYPE__FORMAT_DISTRIBUTOR:
				getFormatDistributor().clear();
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
			case GMDPackage.MD_FORMAT_TYPE__NAME:
				return name != null;
			case GMDPackage.MD_FORMAT_TYPE__VERSION:
				return version != null;
			case GMDPackage.MD_FORMAT_TYPE__AMENDMENT_NUMBER:
				return amendmentNumber != null;
			case GMDPackage.MD_FORMAT_TYPE__SPECIFICATION:
				return specification != null;
			case GMDPackage.MD_FORMAT_TYPE__FILE_DECOMPRESSION_TECHNIQUE:
				return fileDecompressionTechnique != null;
			case GMDPackage.MD_FORMAT_TYPE__FORMAT_DISTRIBUTOR:
				return formatDistributor != null && !formatDistributor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDFormatTypeImpl
