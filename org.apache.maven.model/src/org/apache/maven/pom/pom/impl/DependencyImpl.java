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
package org.apache.maven.pom.pom.impl;

import org.apache.maven.pom.pom.Dependency;
import org.apache.maven.pom.pom.ExclusionsType;
import org.apache.maven.pom.pom.POMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getSystemPath <em>System Path</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getExclusions <em>Exclusions</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.impl.DependencyImpl#getOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected String artifactId = ARTIFACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "jar";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected String classifier = CLASSIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemPath() <em>System Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemPath() <em>System Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPath()
	 * @generated
	 * @ordered
	 */
	protected String systemPath = SYSTEM_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExclusions() <em>Exclusions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusions()
	 * @generated
	 * @ordered
	 */
	protected ExclusionsType exclusions;

	/**
	 * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected String optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return POMPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactId() {
		return artifactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactId(String newArtifactId) {
		String oldArtifactId = artifactId;
		artifactId = newArtifactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__ARTIFACT_ID, oldArtifactId, artifactId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, POMPackage.DEPENDENCY__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifier(String newClassifier) {
		String oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemPath() {
		return systemPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemPath(String newSystemPath) {
		String oldSystemPath = systemPath;
		systemPath = newSystemPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__SYSTEM_PATH, oldSystemPath, systemPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionsType getExclusions() {
		return exclusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclusions(ExclusionsType newExclusions, NotificationChain msgs) {
		ExclusionsType oldExclusions = exclusions;
		exclusions = newExclusions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__EXCLUSIONS, oldExclusions, newExclusions);
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
	public void setExclusions(ExclusionsType newExclusions) {
		if (newExclusions != exclusions) {
			NotificationChain msgs = null;
			if (exclusions != null)
				msgs = ((InternalEObject)exclusions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - POMPackage.DEPENDENCY__EXCLUSIONS, null, msgs);
			if (newExclusions != null)
				msgs = ((InternalEObject)newExclusions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - POMPackage.DEPENDENCY__EXCLUSIONS, null, msgs);
			msgs = basicSetExclusions(newExclusions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__EXCLUSIONS, newExclusions, newExclusions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(String newOptional) {
		String oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.DEPENDENCY__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case POMPackage.DEPENDENCY__EXCLUSIONS:
				return basicSetExclusions(null, msgs);
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
			case POMPackage.DEPENDENCY__GROUP_ID:
				return getGroupId();
			case POMPackage.DEPENDENCY__ARTIFACT_ID:
				return getArtifactId();
			case POMPackage.DEPENDENCY__VERSION:
				return getVersion();
			case POMPackage.DEPENDENCY__TYPE:
				return getType();
			case POMPackage.DEPENDENCY__CLASSIFIER:
				return getClassifier();
			case POMPackage.DEPENDENCY__SCOPE:
				return getScope();
			case POMPackage.DEPENDENCY__SYSTEM_PATH:
				return getSystemPath();
			case POMPackage.DEPENDENCY__EXCLUSIONS:
				return getExclusions();
			case POMPackage.DEPENDENCY__OPTIONAL:
				return getOptional();
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
			case POMPackage.DEPENDENCY__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case POMPackage.DEPENDENCY__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case POMPackage.DEPENDENCY__VERSION:
				setVersion((String)newValue);
				return;
			case POMPackage.DEPENDENCY__TYPE:
				setType((String)newValue);
				return;
			case POMPackage.DEPENDENCY__CLASSIFIER:
				setClassifier((String)newValue);
				return;
			case POMPackage.DEPENDENCY__SCOPE:
				setScope((String)newValue);
				return;
			case POMPackage.DEPENDENCY__SYSTEM_PATH:
				setSystemPath((String)newValue);
				return;
			case POMPackage.DEPENDENCY__EXCLUSIONS:
				setExclusions((ExclusionsType)newValue);
				return;
			case POMPackage.DEPENDENCY__OPTIONAL:
				setOptional((String)newValue);
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
			case POMPackage.DEPENDENCY__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case POMPackage.DEPENDENCY__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case POMPackage.DEPENDENCY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case POMPackage.DEPENDENCY__TYPE:
				unsetType();
				return;
			case POMPackage.DEPENDENCY__CLASSIFIER:
				setClassifier(CLASSIFIER_EDEFAULT);
				return;
			case POMPackage.DEPENDENCY__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case POMPackage.DEPENDENCY__SYSTEM_PATH:
				setSystemPath(SYSTEM_PATH_EDEFAULT);
				return;
			case POMPackage.DEPENDENCY__EXCLUSIONS:
				setExclusions((ExclusionsType)null);
				return;
			case POMPackage.DEPENDENCY__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case POMPackage.DEPENDENCY__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case POMPackage.DEPENDENCY__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case POMPackage.DEPENDENCY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case POMPackage.DEPENDENCY__TYPE:
				return isSetType();
			case POMPackage.DEPENDENCY__CLASSIFIER:
				return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
			case POMPackage.DEPENDENCY__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case POMPackage.DEPENDENCY__SYSTEM_PATH:
				return SYSTEM_PATH_EDEFAULT == null ? systemPath != null : !SYSTEM_PATH_EDEFAULT.equals(systemPath);
			case POMPackage.DEPENDENCY__EXCLUSIONS:
				return exclusions != null;
			case POMPackage.DEPENDENCY__OPTIONAL:
				return OPTIONAL_EDEFAULT == null ? optional != null : !OPTIONAL_EDEFAULT.equals(optional);
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(", artifactId: ");
		result.append(artifactId);
		result.append(", version: ");
		result.append(version);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", classifier: ");
		result.append(classifier);
		result.append(", scope: ");
		result.append(scope);
		result.append(", systemPath: ");
		result.append(systemPath);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //DependencyImpl
