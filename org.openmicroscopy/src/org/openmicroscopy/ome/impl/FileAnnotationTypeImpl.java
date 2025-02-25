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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openmicroscopy.ome.BinaryFileType;
import org.openmicroscopy.ome.FileAnnotationType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.FileAnnotationTypeImpl#getBinaryFile <em>Binary File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileAnnotationTypeImpl extends TypeAnnotationImpl implements FileAnnotationType {
	/**
	 * The cached value of the '{@link #getBinaryFile() <em>Binary File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryFile()
	 * @generated
	 * @ordered
	 */
	protected BinaryFileType binaryFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileAnnotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getFileAnnotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryFileType getBinaryFile() {
		return binaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryFile(BinaryFileType newBinaryFile, NotificationChain msgs) {
		BinaryFileType oldBinaryFile = binaryFile;
		binaryFile = newBinaryFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE, oldBinaryFile, newBinaryFile);
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
	public void setBinaryFile(BinaryFileType newBinaryFile) {
		if (newBinaryFile != binaryFile) {
			NotificationChain msgs = null;
			if (binaryFile != null)
				msgs = ((InternalEObject)binaryFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE, null, msgs);
			if (newBinaryFile != null)
				msgs = ((InternalEObject)newBinaryFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE, null, msgs);
			msgs = basicSetBinaryFile(newBinaryFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE, newBinaryFile, newBinaryFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE:
				return basicSetBinaryFile(null, msgs);
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
			case OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE:
				return getBinaryFile();
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
			case OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE:
				setBinaryFile((BinaryFileType)newValue);
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
			case OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE:
				setBinaryFile((BinaryFileType)null);
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
			case OMEPackage.FILE_ANNOTATION_TYPE__BINARY_FILE:
				return binaryFile != null;
		}
		return super.eIsSet(featureID);
	}

} //FileAnnotationTypeImpl
