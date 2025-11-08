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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CallstackType;
import org.cyclonedx.schema.bom.FramesType;
import org.cyclonedx.schema.bom.ToolsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callstack Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CallstackTypeImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CallstackTypeImpl#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallstackTypeImpl extends MinimalEObjectImpl.Container implements CallstackType {
	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected FramesType frames;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected ToolsType tools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallstackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getCallstackType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramesType getFrames() {
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrames(FramesType newFrames, NotificationChain msgs) {
		FramesType oldFrames = frames;
		frames = newFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CALLSTACK_TYPE__FRAMES, oldFrames, newFrames);
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
	public void setFrames(FramesType newFrames) {
		if (newFrames != frames) {
			NotificationChain msgs = null;
			if (frames != null)
				msgs = ((InternalEObject)frames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CALLSTACK_TYPE__FRAMES, null, msgs);
			if (newFrames != null)
				msgs = ((InternalEObject)newFrames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CALLSTACK_TYPE__FRAMES, null, msgs);
			msgs = basicSetFrames(newFrames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CALLSTACK_TYPE__FRAMES, newFrames, newFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolsType getTools() {
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTools(ToolsType newTools, NotificationChain msgs) {
		ToolsType oldTools = tools;
		tools = newTools;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CALLSTACK_TYPE__TOOLS, oldTools, newTools);
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
	public void setTools(ToolsType newTools) {
		if (newTools != tools) {
			NotificationChain msgs = null;
			if (tools != null)
				msgs = ((InternalEObject)tools).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CALLSTACK_TYPE__TOOLS, null, msgs);
			if (newTools != null)
				msgs = ((InternalEObject)newTools).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CALLSTACK_TYPE__TOOLS, null, msgs);
			msgs = basicSetTools(newTools, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CALLSTACK_TYPE__TOOLS, newTools, newTools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.CALLSTACK_TYPE__FRAMES:
				return basicSetFrames(null, msgs);
			case BOMPackage.CALLSTACK_TYPE__TOOLS:
				return basicSetTools(null, msgs);
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
			case BOMPackage.CALLSTACK_TYPE__FRAMES:
				return getFrames();
			case BOMPackage.CALLSTACK_TYPE__TOOLS:
				return getTools();
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
			case BOMPackage.CALLSTACK_TYPE__FRAMES:
				setFrames((FramesType)newValue);
				return;
			case BOMPackage.CALLSTACK_TYPE__TOOLS:
				setTools((ToolsType)newValue);
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
			case BOMPackage.CALLSTACK_TYPE__FRAMES:
				setFrames((FramesType)null);
				return;
			case BOMPackage.CALLSTACK_TYPE__TOOLS:
				setTools((ToolsType)null);
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
			case BOMPackage.CALLSTACK_TYPE__FRAMES:
				return frames != null;
			case BOMPackage.CALLSTACK_TYPE__TOOLS:
				return tools != null;
		}
		return super.eIsSet(featureID);
	}

} //CallstackTypeImpl
