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
package net.opengis.wfs.impl;

import java.math.BigInteger;

import net.opengis.ogc.GmlObjectIdType;

import net.opengis.wfs.GetGmlObjectType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Gml Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.GetGmlObjectTypeImpl#getGmlObjectId <em>Gml Object Id</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetGmlObjectTypeImpl#getOutputFormat <em>Output Format</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetGmlObjectTypeImpl#getTraverseXlinkDepth <em>Traverse Xlink Depth</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetGmlObjectTypeImpl#getTraverseXlinkExpiry <em>Traverse Xlink Expiry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetGmlObjectTypeImpl extends BaseRequestTypeImpl implements GetGmlObjectType {
	/**
	 * The cached value of the '{@link #getGmlObjectId() <em>Gml Object Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlObjectId()
	 * @generated
	 * @ordered
	 */
	protected GmlObjectIdType gmlObjectId;

	/**
	 * The default value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FORMAT_EDEFAULT = "GML3";

	/**
	 * The cached value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected String outputFormat = OUTPUT_FORMAT_EDEFAULT;

	/**
	 * This is true if the Output Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outputFormatESet;

	/**
	 * The default value of the '{@link #getTraverseXlinkDepth() <em>Traverse Xlink Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraverseXlinkDepth()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAVERSE_XLINK_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraverseXlinkDepth() <em>Traverse Xlink Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraverseXlinkDepth()
	 * @generated
	 * @ordered
	 */
	protected String traverseXlinkDepth = TRAVERSE_XLINK_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraverseXlinkExpiry() <em>Traverse Xlink Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraverseXlinkExpiry()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TRAVERSE_XLINK_EXPIRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraverseXlinkExpiry() <em>Traverse Xlink Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraverseXlinkExpiry()
	 * @generated
	 * @ordered
	 */
	protected BigInteger traverseXlinkExpiry = TRAVERSE_XLINK_EXPIRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetGmlObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.GET_GML_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GmlObjectIdType getGmlObjectId() {
		return gmlObjectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlObjectId(GmlObjectIdType newGmlObjectId, NotificationChain msgs) {
		GmlObjectIdType oldGmlObjectId = gmlObjectId;
		gmlObjectId = newGmlObjectId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID, oldGmlObjectId, newGmlObjectId);
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
	public void setGmlObjectId(GmlObjectIdType newGmlObjectId) {
		if (newGmlObjectId != gmlObjectId) {
			NotificationChain msgs = null;
			if (gmlObjectId != null)
				msgs = ((InternalEObject)gmlObjectId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID, null, msgs);
			if (newGmlObjectId != null)
				msgs = ((InternalEObject)newGmlObjectId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID, null, msgs);
			msgs = basicSetGmlObjectId(newGmlObjectId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID, newGmlObjectId, newGmlObjectId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputFormat() {
		return outputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputFormat(String newOutputFormat) {
		String oldOutputFormat = outputFormat;
		outputFormat = newOutputFormat;
		boolean oldOutputFormatESet = outputFormatESet;
		outputFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_GML_OBJECT_TYPE__OUTPUT_FORMAT, oldOutputFormat, outputFormat, !oldOutputFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOutputFormat() {
		String oldOutputFormat = outputFormat;
		boolean oldOutputFormatESet = outputFormatESet;
		outputFormat = OUTPUT_FORMAT_EDEFAULT;
		outputFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.GET_GML_OBJECT_TYPE__OUTPUT_FORMAT, oldOutputFormat, OUTPUT_FORMAT_EDEFAULT, oldOutputFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOutputFormat() {
		return outputFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTraverseXlinkDepth() {
		return traverseXlinkDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraverseXlinkDepth(String newTraverseXlinkDepth) {
		String oldTraverseXlinkDepth = traverseXlinkDepth;
		traverseXlinkDepth = newTraverseXlinkDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_DEPTH, oldTraverseXlinkDepth, traverseXlinkDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTraverseXlinkExpiry() {
		return traverseXlinkExpiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraverseXlinkExpiry(BigInteger newTraverseXlinkExpiry) {
		BigInteger oldTraverseXlinkExpiry = traverseXlinkExpiry;
		traverseXlinkExpiry = newTraverseXlinkExpiry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_EXPIRY, oldTraverseXlinkExpiry, traverseXlinkExpiry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID:
				return basicSetGmlObjectId(null, msgs);
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
			case WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID:
				return getGmlObjectId();
			case WFSPackage.GET_GML_OBJECT_TYPE__OUTPUT_FORMAT:
				return getOutputFormat();
			case WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_DEPTH:
				return getTraverseXlinkDepth();
			case WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_EXPIRY:
				return getTraverseXlinkExpiry();
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
			case WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID:
				setGmlObjectId((GmlObjectIdType)newValue);
				return;
			case WFSPackage.GET_GML_OBJECT_TYPE__OUTPUT_FORMAT:
				setOutputFormat((String)newValue);
				return;
			case WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_DEPTH:
				setTraverseXlinkDepth((String)newValue);
				return;
			case WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_EXPIRY:
				setTraverseXlinkExpiry((BigInteger)newValue);
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
			case WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID:
				setGmlObjectId((GmlObjectIdType)null);
				return;
			case WFSPackage.GET_GML_OBJECT_TYPE__OUTPUT_FORMAT:
				unsetOutputFormat();
				return;
			case WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_DEPTH:
				setTraverseXlinkDepth(TRAVERSE_XLINK_DEPTH_EDEFAULT);
				return;
			case WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_EXPIRY:
				setTraverseXlinkExpiry(TRAVERSE_XLINK_EXPIRY_EDEFAULT);
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
			case WFSPackage.GET_GML_OBJECT_TYPE__GML_OBJECT_ID:
				return gmlObjectId != null;
			case WFSPackage.GET_GML_OBJECT_TYPE__OUTPUT_FORMAT:
				return isSetOutputFormat();
			case WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_DEPTH:
				return TRAVERSE_XLINK_DEPTH_EDEFAULT == null ? traverseXlinkDepth != null : !TRAVERSE_XLINK_DEPTH_EDEFAULT.equals(traverseXlinkDepth);
			case WFSPackage.GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_EXPIRY:
				return TRAVERSE_XLINK_EXPIRY_EDEFAULT == null ? traverseXlinkExpiry != null : !TRAVERSE_XLINK_EXPIRY_EDEFAULT.equals(traverseXlinkExpiry);
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
		result.append(" (outputFormat: ");
		if (outputFormatESet) result.append(outputFormat); else result.append("<unset>");
		result.append(", traverseXlinkDepth: ");
		result.append(traverseXlinkDepth);
		result.append(", traverseXlinkExpiry: ");
		result.append(traverseXlinkExpiry);
		result.append(')');
		return result.toString();
	}

} //GetGmlObjectTypeImpl
