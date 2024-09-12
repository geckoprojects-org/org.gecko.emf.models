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
package net.opengis.wfs;

import java.math.BigInteger;

import net.opengis.fes.AbstractQueryExpressionType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lock Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.LockFeatureType#getAbstractQueryExpressionGroup <em>Abstract Query Expression Group</em>}</li>
 *   <li>{@link net.opengis.wfs.LockFeatureType#getAbstractQueryExpression <em>Abstract Query Expression</em>}</li>
 *   <li>{@link net.opengis.wfs.LockFeatureType#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link net.opengis.wfs.LockFeatureType#getLockAction <em>Lock Action</em>}</li>
 *   <li>{@link net.opengis.wfs.LockFeatureType#getLockId <em>Lock Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getLockFeatureType()
 * @model extendedMetaData="name='LockFeatureType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LockFeatureType extends BaseRequestType {
	/**
	 * Returns the value of the '<em><b>Abstract Query Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Query Expression Group</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getLockFeatureType_AbstractQueryExpressionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractQueryExpression:group' namespace='http://www.opengis.net/fes/2.0'"
	 * @generated
	 */
	FeatureMap getAbstractQueryExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Query Expression</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.fes.AbstractQueryExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Query Expression</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getLockFeatureType_AbstractQueryExpression()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractQueryExpression' namespace='http://www.opengis.net/fes/2.0' group='http://www.opengis.net/fes/2.0#AbstractQueryExpression:group'"
	 * @generated
	 */
	EList<AbstractQueryExpressionType> getAbstractQueryExpression();

	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry</em>' attribute.
	 * @see #isSetExpiry()
	 * @see #unsetExpiry()
	 * @see #setExpiry(BigInteger)
	 * @see net.opengis.wfs.WFSPackage#getLockFeatureType_Expiry()
	 * @model default="300" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='expiry'"
	 * @generated
	 */
	BigInteger getExpiry();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.LockFeatureType#getExpiry <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' attribute.
	 * @see #isSetExpiry()
	 * @see #unsetExpiry()
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(BigInteger value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.LockFeatureType#getExpiry <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpiry()
	 * @see #getExpiry()
	 * @see #setExpiry(BigInteger)
	 * @generated
	 */
	void unsetExpiry();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.LockFeatureType#getExpiry <em>Expiry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expiry</em>' attribute is set.
	 * @see #unsetExpiry()
	 * @see #getExpiry()
	 * @see #setExpiry(BigInteger)
	 * @generated
	 */
	boolean isSetExpiry();

	/**
	 * Returns the value of the '<em><b>Lock Action</b></em>' attribute.
	 * The default value is <code>"ALL"</code>.
	 * The literals are from the enumeration {@link net.opengis.wfs.AllSomeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Action</em>' attribute.
	 * @see net.opengis.wfs.AllSomeType
	 * @see #isSetLockAction()
	 * @see #unsetLockAction()
	 * @see #setLockAction(AllSomeType)
	 * @see net.opengis.wfs.WFSPackage#getLockFeatureType_LockAction()
	 * @model default="ALL" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lockAction'"
	 * @generated
	 */
	AllSomeType getLockAction();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.LockFeatureType#getLockAction <em>Lock Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Action</em>' attribute.
	 * @see net.opengis.wfs.AllSomeType
	 * @see #isSetLockAction()
	 * @see #unsetLockAction()
	 * @see #getLockAction()
	 * @generated
	 */
	void setLockAction(AllSomeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.LockFeatureType#getLockAction <em>Lock Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLockAction()
	 * @see #getLockAction()
	 * @see #setLockAction(AllSomeType)
	 * @generated
	 */
	void unsetLockAction();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.LockFeatureType#getLockAction <em>Lock Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lock Action</em>' attribute is set.
	 * @see #unsetLockAction()
	 * @see #getLockAction()
	 * @see #setLockAction(AllSomeType)
	 * @generated
	 */
	boolean isSetLockAction();

	/**
	 * Returns the value of the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Id</em>' attribute.
	 * @see #setLockId(String)
	 * @see net.opengis.wfs.WFSPackage#getLockFeatureType_LockId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lockId'"
	 * @generated
	 */
	String getLockId();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.LockFeatureType#getLockId <em>Lock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Id</em>' attribute.
	 * @see #getLockId()
	 * @generated
	 */
	void setLockId(String value);

} // LockFeatureType
