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

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDBrowseGraphicType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Browse Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBrowseGraphicTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBrowseGraphicTypeImpl#getFileDescription <em>File Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDBrowseGraphicTypeImpl#getFileType <em>File Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDBrowseGraphicTypeImpl extends AbstractObjectTypeImpl implements MDBrowseGraphicType {
	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType fileName;

	/**
	 * The cached value of the '{@link #getFileDescription() <em>File Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType fileDescription;

	/**
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType fileType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDBrowseGraphicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDBrowseGraphicType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileName(CharacterStringPropertyType newFileName, NotificationChain msgs) {
		CharacterStringPropertyType oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME, oldFileName, newFileName);
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
	public void setFileName(CharacterStringPropertyType newFileName) {
		if (newFileName != fileName) {
			NotificationChain msgs = null;
			if (fileName != null)
				msgs = ((InternalEObject)fileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME, null, msgs);
			if (newFileName != null)
				msgs = ((InternalEObject)newFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME, null, msgs);
			msgs = basicSetFileName(newFileName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME, newFileName, newFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getFileDescription() {
		return fileDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileDescription(CharacterStringPropertyType newFileDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldFileDescription = fileDescription;
		fileDescription = newFileDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION, oldFileDescription, newFileDescription);
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
	public void setFileDescription(CharacterStringPropertyType newFileDescription) {
		if (newFileDescription != fileDescription) {
			NotificationChain msgs = null;
			if (fileDescription != null)
				msgs = ((InternalEObject)fileDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION, null, msgs);
			if (newFileDescription != null)
				msgs = ((InternalEObject)newFileDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION, null, msgs);
			msgs = basicSetFileDescription(newFileDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION, newFileDescription, newFileDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getFileType() {
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileType(CharacterStringPropertyType newFileType, NotificationChain msgs) {
		CharacterStringPropertyType oldFileType = fileType;
		fileType = newFileType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE, oldFileType, newFileType);
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
	public void setFileType(CharacterStringPropertyType newFileType) {
		if (newFileType != fileType) {
			NotificationChain msgs = null;
			if (fileType != null)
				msgs = ((InternalEObject)fileType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE, null, msgs);
			if (newFileType != null)
				msgs = ((InternalEObject)newFileType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE, null, msgs);
			msgs = basicSetFileType(newFileType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE, newFileType, newFileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME:
				return basicSetFileName(null, msgs);
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION:
				return basicSetFileDescription(null, msgs);
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE:
				return basicSetFileType(null, msgs);
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
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME:
				return getFileName();
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION:
				return getFileDescription();
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE:
				return getFileType();
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
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME:
				setFileName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION:
				setFileDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE:
				setFileType((CharacterStringPropertyType)newValue);
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
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME:
				setFileName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION:
				setFileDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE:
				setFileType((CharacterStringPropertyType)null);
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
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_NAME:
				return fileName != null;
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_DESCRIPTION:
				return fileDescription != null;
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE__FILE_TYPE:
				return fileType != null;
		}
		return super.eIsSet(featureID);
	}

} //MDBrowseGraphicTypeImpl
