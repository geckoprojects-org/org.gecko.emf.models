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

import java.math.BigInteger;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.FrameType;
import org.cyclonedx.schema.bom.ParametersType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FrameTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FrameTypeImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FrameTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FrameTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FrameTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FrameTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FrameTypeImpl#getFullFilename <em>Full Filename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameTypeImpl extends MinimalEObjectImpl.Container implements FrameType {
	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected String module = MODULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParametersType1 parameters;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected BigInteger line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected BigInteger column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullFilename() <em>Full Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullFilename() <em>Full Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullFilename()
	 * @generated
	 * @ordered
	 */
	protected String fullFilename = FULL_FILENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getFrameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FRAME_TYPE__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(String newModule) {
		String oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FRAME_TYPE__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FRAME_TYPE__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersType1 getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType1 newParameters, NotificationChain msgs) {
		ParametersType1 oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.FRAME_TYPE__PARAMETERS, oldParameters, newParameters);
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
	public void setParameters(ParametersType1 newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.FRAME_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.FRAME_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FRAME_TYPE__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine(BigInteger newLine) {
		BigInteger oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FRAME_TYPE__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumn(BigInteger newColumn) {
		BigInteger oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FRAME_TYPE__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullFilename() {
		return fullFilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullFilename(String newFullFilename) {
		String oldFullFilename = fullFilename;
		fullFilename = newFullFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FRAME_TYPE__FULL_FILENAME, oldFullFilename, fullFilename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.FRAME_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
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
			case BOMPackage.FRAME_TYPE__PACKAGE:
				return getPackage();
			case BOMPackage.FRAME_TYPE__MODULE:
				return getModule();
			case BOMPackage.FRAME_TYPE__FUNCTION:
				return getFunction();
			case BOMPackage.FRAME_TYPE__PARAMETERS:
				return getParameters();
			case BOMPackage.FRAME_TYPE__LINE:
				return getLine();
			case BOMPackage.FRAME_TYPE__COLUMN:
				return getColumn();
			case BOMPackage.FRAME_TYPE__FULL_FILENAME:
				return getFullFilename();
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
			case BOMPackage.FRAME_TYPE__PACKAGE:
				setPackage((String)newValue);
				return;
			case BOMPackage.FRAME_TYPE__MODULE:
				setModule((String)newValue);
				return;
			case BOMPackage.FRAME_TYPE__FUNCTION:
				setFunction((String)newValue);
				return;
			case BOMPackage.FRAME_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case BOMPackage.FRAME_TYPE__LINE:
				setLine((BigInteger)newValue);
				return;
			case BOMPackage.FRAME_TYPE__COLUMN:
				setColumn((BigInteger)newValue);
				return;
			case BOMPackage.FRAME_TYPE__FULL_FILENAME:
				setFullFilename((String)newValue);
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
			case BOMPackage.FRAME_TYPE__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case BOMPackage.FRAME_TYPE__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case BOMPackage.FRAME_TYPE__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case BOMPackage.FRAME_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case BOMPackage.FRAME_TYPE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case BOMPackage.FRAME_TYPE__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case BOMPackage.FRAME_TYPE__FULL_FILENAME:
				setFullFilename(FULL_FILENAME_EDEFAULT);
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
			case BOMPackage.FRAME_TYPE__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case BOMPackage.FRAME_TYPE__MODULE:
				return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
			case BOMPackage.FRAME_TYPE__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case BOMPackage.FRAME_TYPE__PARAMETERS:
				return parameters != null;
			case BOMPackage.FRAME_TYPE__LINE:
				return LINE_EDEFAULT == null ? line != null : !LINE_EDEFAULT.equals(line);
			case BOMPackage.FRAME_TYPE__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case BOMPackage.FRAME_TYPE__FULL_FILENAME:
				return FULL_FILENAME_EDEFAULT == null ? fullFilename != null : !FULL_FILENAME_EDEFAULT.equals(fullFilename);
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
		result.append(" (package: ");
		result.append(package_);
		result.append(", module: ");
		result.append(module);
		result.append(", function: ");
		result.append(function);
		result.append(", line: ");
		result.append(line);
		result.append(", column: ");
		result.append(column);
		result.append(", fullFilename: ");
		result.append(fullFilename);
		result.append(')');
		return result.toString();
	}

} //FrameTypeImpl
