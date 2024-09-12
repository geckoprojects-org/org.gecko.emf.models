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

import org.isotc211._2005.gco.BinaryPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDApplicationSchemaInformationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Application Schema Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDApplicationSchemaInformationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDApplicationSchemaInformationTypeImpl#getSchemaLanguage <em>Schema Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDApplicationSchemaInformationTypeImpl#getConstraintLanguage <em>Constraint Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDApplicationSchemaInformationTypeImpl#getSchemaAscii <em>Schema Ascii</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDApplicationSchemaInformationTypeImpl#getGraphicsFile <em>Graphics File</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDApplicationSchemaInformationTypeImpl#getSoftwareDevelopmentFile <em>Software Development File</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDApplicationSchemaInformationTypeImpl#getSoftwareDevelopmentFileFormat <em>Software Development File Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDApplicationSchemaInformationTypeImpl extends AbstractObjectTypeImpl implements MDApplicationSchemaInformationType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CICitationPropertyType name;

	/**
	 * The cached value of the '{@link #getSchemaLanguage() <em>Schema Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLanguage()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType schemaLanguage;

	/**
	 * The cached value of the '{@link #getConstraintLanguage() <em>Constraint Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintLanguage()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType constraintLanguage;

	/**
	 * The cached value of the '{@link #getSchemaAscii() <em>Schema Ascii</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaAscii()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType schemaAscii;

	/**
	 * The cached value of the '{@link #getGraphicsFile() <em>Graphics File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicsFile()
	 * @generated
	 * @ordered
	 */
	protected BinaryPropertyType graphicsFile;

	/**
	 * The cached value of the '{@link #getSoftwareDevelopmentFile() <em>Software Development File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareDevelopmentFile()
	 * @generated
	 * @ordered
	 */
	protected BinaryPropertyType softwareDevelopmentFile;

	/**
	 * The cached value of the '{@link #getSoftwareDevelopmentFileFormat() <em>Software Development File Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareDevelopmentFileFormat()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType softwareDevelopmentFileFormat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDApplicationSchemaInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDApplicationSchemaInformationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationPropertyType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CICitationPropertyType newName, NotificationChain msgs) {
		CICitationPropertyType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME, oldName, newName);
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
	public void setName(CICitationPropertyType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getSchemaLanguage() {
		return schemaLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaLanguage(CharacterStringPropertyType newSchemaLanguage, NotificationChain msgs) {
		CharacterStringPropertyType oldSchemaLanguage = schemaLanguage;
		schemaLanguage = newSchemaLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE, oldSchemaLanguage, newSchemaLanguage);
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
	public void setSchemaLanguage(CharacterStringPropertyType newSchemaLanguage) {
		if (newSchemaLanguage != schemaLanguage) {
			NotificationChain msgs = null;
			if (schemaLanguage != null)
				msgs = ((InternalEObject)schemaLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE, null, msgs);
			if (newSchemaLanguage != null)
				msgs = ((InternalEObject)newSchemaLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE, null, msgs);
			msgs = basicSetSchemaLanguage(newSchemaLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE, newSchemaLanguage, newSchemaLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getConstraintLanguage() {
		return constraintLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintLanguage(CharacterStringPropertyType newConstraintLanguage, NotificationChain msgs) {
		CharacterStringPropertyType oldConstraintLanguage = constraintLanguage;
		constraintLanguage = newConstraintLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE, oldConstraintLanguage, newConstraintLanguage);
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
	public void setConstraintLanguage(CharacterStringPropertyType newConstraintLanguage) {
		if (newConstraintLanguage != constraintLanguage) {
			NotificationChain msgs = null;
			if (constraintLanguage != null)
				msgs = ((InternalEObject)constraintLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE, null, msgs);
			if (newConstraintLanguage != null)
				msgs = ((InternalEObject)newConstraintLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE, null, msgs);
			msgs = basicSetConstraintLanguage(newConstraintLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE, newConstraintLanguage, newConstraintLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getSchemaAscii() {
		return schemaAscii;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaAscii(CharacterStringPropertyType newSchemaAscii, NotificationChain msgs) {
		CharacterStringPropertyType oldSchemaAscii = schemaAscii;
		schemaAscii = newSchemaAscii;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII, oldSchemaAscii, newSchemaAscii);
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
	public void setSchemaAscii(CharacterStringPropertyType newSchemaAscii) {
		if (newSchemaAscii != schemaAscii) {
			NotificationChain msgs = null;
			if (schemaAscii != null)
				msgs = ((InternalEObject)schemaAscii).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII, null, msgs);
			if (newSchemaAscii != null)
				msgs = ((InternalEObject)newSchemaAscii).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII, null, msgs);
			msgs = basicSetSchemaAscii(newSchemaAscii, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII, newSchemaAscii, newSchemaAscii));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryPropertyType getGraphicsFile() {
		return graphicsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicsFile(BinaryPropertyType newGraphicsFile, NotificationChain msgs) {
		BinaryPropertyType oldGraphicsFile = graphicsFile;
		graphicsFile = newGraphicsFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE, oldGraphicsFile, newGraphicsFile);
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
	public void setGraphicsFile(BinaryPropertyType newGraphicsFile) {
		if (newGraphicsFile != graphicsFile) {
			NotificationChain msgs = null;
			if (graphicsFile != null)
				msgs = ((InternalEObject)graphicsFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE, null, msgs);
			if (newGraphicsFile != null)
				msgs = ((InternalEObject)newGraphicsFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE, null, msgs);
			msgs = basicSetGraphicsFile(newGraphicsFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE, newGraphicsFile, newGraphicsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryPropertyType getSoftwareDevelopmentFile() {
		return softwareDevelopmentFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareDevelopmentFile(BinaryPropertyType newSoftwareDevelopmentFile, NotificationChain msgs) {
		BinaryPropertyType oldSoftwareDevelopmentFile = softwareDevelopmentFile;
		softwareDevelopmentFile = newSoftwareDevelopmentFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE, oldSoftwareDevelopmentFile, newSoftwareDevelopmentFile);
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
	public void setSoftwareDevelopmentFile(BinaryPropertyType newSoftwareDevelopmentFile) {
		if (newSoftwareDevelopmentFile != softwareDevelopmentFile) {
			NotificationChain msgs = null;
			if (softwareDevelopmentFile != null)
				msgs = ((InternalEObject)softwareDevelopmentFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE, null, msgs);
			if (newSoftwareDevelopmentFile != null)
				msgs = ((InternalEObject)newSoftwareDevelopmentFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE, null, msgs);
			msgs = basicSetSoftwareDevelopmentFile(newSoftwareDevelopmentFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE, newSoftwareDevelopmentFile, newSoftwareDevelopmentFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getSoftwareDevelopmentFileFormat() {
		return softwareDevelopmentFileFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareDevelopmentFileFormat(CharacterStringPropertyType newSoftwareDevelopmentFileFormat, NotificationChain msgs) {
		CharacterStringPropertyType oldSoftwareDevelopmentFileFormat = softwareDevelopmentFileFormat;
		softwareDevelopmentFileFormat = newSoftwareDevelopmentFileFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT, oldSoftwareDevelopmentFileFormat, newSoftwareDevelopmentFileFormat);
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
	public void setSoftwareDevelopmentFileFormat(CharacterStringPropertyType newSoftwareDevelopmentFileFormat) {
		if (newSoftwareDevelopmentFileFormat != softwareDevelopmentFileFormat) {
			NotificationChain msgs = null;
			if (softwareDevelopmentFileFormat != null)
				msgs = ((InternalEObject)softwareDevelopmentFileFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT, null, msgs);
			if (newSoftwareDevelopmentFileFormat != null)
				msgs = ((InternalEObject)newSoftwareDevelopmentFileFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT, null, msgs);
			msgs = basicSetSoftwareDevelopmentFileFormat(newSoftwareDevelopmentFileFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT, newSoftwareDevelopmentFileFormat, newSoftwareDevelopmentFileFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME:
				return basicSetName(null, msgs);
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE:
				return basicSetSchemaLanguage(null, msgs);
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE:
				return basicSetConstraintLanguage(null, msgs);
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII:
				return basicSetSchemaAscii(null, msgs);
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE:
				return basicSetGraphicsFile(null, msgs);
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE:
				return basicSetSoftwareDevelopmentFile(null, msgs);
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT:
				return basicSetSoftwareDevelopmentFileFormat(null, msgs);
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
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME:
				return getName();
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE:
				return getSchemaLanguage();
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE:
				return getConstraintLanguage();
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII:
				return getSchemaAscii();
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE:
				return getGraphicsFile();
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE:
				return getSoftwareDevelopmentFile();
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT:
				return getSoftwareDevelopmentFileFormat();
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
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME:
				setName((CICitationPropertyType)newValue);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE:
				setSchemaLanguage((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE:
				setConstraintLanguage((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII:
				setSchemaAscii((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE:
				setGraphicsFile((BinaryPropertyType)newValue);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE:
				setSoftwareDevelopmentFile((BinaryPropertyType)newValue);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT:
				setSoftwareDevelopmentFileFormat((CharacterStringPropertyType)newValue);
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
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME:
				setName((CICitationPropertyType)null);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE:
				setSchemaLanguage((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE:
				setConstraintLanguage((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII:
				setSchemaAscii((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE:
				setGraphicsFile((BinaryPropertyType)null);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE:
				setSoftwareDevelopmentFile((BinaryPropertyType)null);
				return;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT:
				setSoftwareDevelopmentFileFormat((CharacterStringPropertyType)null);
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
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__NAME:
				return name != null;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_LANGUAGE:
				return schemaLanguage != null;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__CONSTRAINT_LANGUAGE:
				return constraintLanguage != null;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SCHEMA_ASCII:
				return schemaAscii != null;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__GRAPHICS_FILE:
				return graphicsFile != null;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE:
				return softwareDevelopmentFile != null;
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE__SOFTWARE_DEVELOPMENT_FILE_FORMAT:
				return softwareDevelopmentFileFormat != null;
		}
		return super.eIsSet(featureID);
	}

} //MDApplicationSchemaInformationTypeImpl
