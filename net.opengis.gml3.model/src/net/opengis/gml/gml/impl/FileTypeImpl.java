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

import net.opengis.gml.gml.AssociationRoleType;
import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.FileType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.FileTypeImpl#getRangeParameters <em>Range Parameters</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FileTypeImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FileTypeImpl#getFileReference <em>File Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FileTypeImpl#getFileStructure <em>File Structure</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FileTypeImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FileTypeImpl#getCompression <em>Compression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileTypeImpl extends MinimalEObjectImpl.Container implements FileType {
	/**
	 * The cached value of the '{@link #getRangeParameters() <em>Range Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeParameters()
	 * @generated
	 * @ordered
	 */
	protected AssociationRoleType rangeParameters;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileReference() <em>File Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileReference()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileReference() <em>File Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileReference()
	 * @generated
	 * @ordered
	 */
	protected String fileReference = FILE_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFileStructure() <em>File Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileStructure()
	 * @generated
	 * @ordered
	 */
	protected CodeType fileStructure;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected String compression = COMPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getFileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationRoleType getRangeParameters() {
		return rangeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeParameters(AssociationRoleType newRangeParameters, NotificationChain msgs) {
		AssociationRoleType oldRangeParameters = rangeParameters;
		rangeParameters = newRangeParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.FILE_TYPE__RANGE_PARAMETERS, oldRangeParameters, newRangeParameters);
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
	public void setRangeParameters(AssociationRoleType newRangeParameters) {
		if (newRangeParameters != rangeParameters) {
			NotificationChain msgs = null;
			if (rangeParameters != null)
				msgs = ((InternalEObject)rangeParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.FILE_TYPE__RANGE_PARAMETERS, null, msgs);
			if (newRangeParameters != null)
				msgs = ((InternalEObject)newRangeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.FILE_TYPE__RANGE_PARAMETERS, null, msgs);
			msgs = basicSetRangeParameters(newRangeParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FILE_TYPE__RANGE_PARAMETERS, newRangeParameters, newRangeParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FILE_TYPE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileReference() {
		return fileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileReference(String newFileReference) {
		String oldFileReference = fileReference;
		fileReference = newFileReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FILE_TYPE__FILE_REFERENCE, oldFileReference, fileReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getFileStructure() {
		return fileStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileStructure(CodeType newFileStructure, NotificationChain msgs) {
		CodeType oldFileStructure = fileStructure;
		fileStructure = newFileStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.FILE_TYPE__FILE_STRUCTURE, oldFileStructure, newFileStructure);
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
	public void setFileStructure(CodeType newFileStructure) {
		if (newFileStructure != fileStructure) {
			NotificationChain msgs = null;
			if (fileStructure != null)
				msgs = ((InternalEObject)fileStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.FILE_TYPE__FILE_STRUCTURE, null, msgs);
			if (newFileStructure != null)
				msgs = ((InternalEObject)newFileStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.FILE_TYPE__FILE_STRUCTURE, null, msgs);
			msgs = basicSetFileStructure(newFileStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FILE_TYPE__FILE_STRUCTURE, newFileStructure, newFileStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FILE_TYPE__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompression(String newCompression) {
		String oldCompression = compression;
		compression = newCompression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.FILE_TYPE__COMPRESSION, oldCompression, compression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.FILE_TYPE__RANGE_PARAMETERS:
				return basicSetRangeParameters(null, msgs);
			case GMLPackage.FILE_TYPE__FILE_STRUCTURE:
				return basicSetFileStructure(null, msgs);
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
			case GMLPackage.FILE_TYPE__RANGE_PARAMETERS:
				return getRangeParameters();
			case GMLPackage.FILE_TYPE__FILE_NAME:
				return getFileName();
			case GMLPackage.FILE_TYPE__FILE_REFERENCE:
				return getFileReference();
			case GMLPackage.FILE_TYPE__FILE_STRUCTURE:
				return getFileStructure();
			case GMLPackage.FILE_TYPE__MIME_TYPE:
				return getMimeType();
			case GMLPackage.FILE_TYPE__COMPRESSION:
				return getCompression();
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
			case GMLPackage.FILE_TYPE__RANGE_PARAMETERS:
				setRangeParameters((AssociationRoleType)newValue);
				return;
			case GMLPackage.FILE_TYPE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case GMLPackage.FILE_TYPE__FILE_REFERENCE:
				setFileReference((String)newValue);
				return;
			case GMLPackage.FILE_TYPE__FILE_STRUCTURE:
				setFileStructure((CodeType)newValue);
				return;
			case GMLPackage.FILE_TYPE__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case GMLPackage.FILE_TYPE__COMPRESSION:
				setCompression((String)newValue);
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
			case GMLPackage.FILE_TYPE__RANGE_PARAMETERS:
				setRangeParameters((AssociationRoleType)null);
				return;
			case GMLPackage.FILE_TYPE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case GMLPackage.FILE_TYPE__FILE_REFERENCE:
				setFileReference(FILE_REFERENCE_EDEFAULT);
				return;
			case GMLPackage.FILE_TYPE__FILE_STRUCTURE:
				setFileStructure((CodeType)null);
				return;
			case GMLPackage.FILE_TYPE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case GMLPackage.FILE_TYPE__COMPRESSION:
				setCompression(COMPRESSION_EDEFAULT);
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
			case GMLPackage.FILE_TYPE__RANGE_PARAMETERS:
				return rangeParameters != null;
			case GMLPackage.FILE_TYPE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case GMLPackage.FILE_TYPE__FILE_REFERENCE:
				return FILE_REFERENCE_EDEFAULT == null ? fileReference != null : !FILE_REFERENCE_EDEFAULT.equals(fileReference);
			case GMLPackage.FILE_TYPE__FILE_STRUCTURE:
				return fileStructure != null;
			case GMLPackage.FILE_TYPE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case GMLPackage.FILE_TYPE__COMPRESSION:
				return COMPRESSION_EDEFAULT == null ? compression != null : !COMPRESSION_EDEFAULT.equals(compression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", fileReference: ");
		result.append(fileReference);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", compression: ");
		result.append(compression);
		result.append(')');
		return result.toString();
	}

} //FileTypeImpl
