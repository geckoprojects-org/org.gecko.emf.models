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

import java.math.BigDecimal;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.RatingType;
import org.cyclonedx.schema.bom.ScoreSourceType;
import org.cyclonedx.schema.bom.SeverityType;
import org.cyclonedx.schema.bom.VulnerabilitySourceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rating Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RatingTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RatingTypeImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RatingTypeImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RatingTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RatingTypeImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RatingTypeImpl#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatingTypeImpl extends MinimalEObjectImpl.Container implements RatingType {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected VulnerabilitySourceType source;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SCORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal score = SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityType SEVERITY_EDEFAULT = SeverityType.CRITICAL;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityType severity = SEVERITY_EDEFAULT;

	/**
	 * This is true if the Severity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean severityESet;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final ScoreSourceType METHOD_EDEFAULT = ScoreSourceType.CVS_SV2;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected ScoreSourceType method = METHOD_EDEFAULT;

	/**
	 * This is true if the Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodESet;

	/**
	 * The default value of the '{@link #getVector() <em>Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected static final String VECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVector() <em>Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected String vector = VECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected String justification = JUSTIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getRatingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerabilitySourceType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(VulnerabilitySourceType newSource, NotificationChain msgs) {
		VulnerabilitySourceType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.RATING_TYPE__SOURCE, oldSource, newSource);
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
	public void setSource(VulnerabilitySourceType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.RATING_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.RATING_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RATING_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(BigDecimal newScore) {
		BigDecimal oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RATING_TYPE__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityType getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(SeverityType newSeverity) {
		SeverityType oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		boolean oldSeverityESet = severityESet;
		severityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RATING_TYPE__SEVERITY, oldSeverity, severity, !oldSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSeverity() {
		SeverityType oldSeverity = severity;
		boolean oldSeverityESet = severityESet;
		severity = SEVERITY_EDEFAULT;
		severityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.RATING_TYPE__SEVERITY, oldSeverity, SEVERITY_EDEFAULT, oldSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSeverity() {
		return severityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreSourceType getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(ScoreSourceType newMethod) {
		ScoreSourceType oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		boolean oldMethodESet = methodESet;
		methodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RATING_TYPE__METHOD, oldMethod, method, !oldMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMethod() {
		ScoreSourceType oldMethod = method;
		boolean oldMethodESet = methodESet;
		method = METHOD_EDEFAULT;
		methodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.RATING_TYPE__METHOD, oldMethod, METHOD_EDEFAULT, oldMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMethod() {
		return methodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVector() {
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVector(String newVector) {
		String oldVector = vector;
		vector = newVector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RATING_TYPE__VECTOR, oldVector, vector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustification(String newJustification) {
		String oldJustification = justification;
		justification = newJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.RATING_TYPE__JUSTIFICATION, oldJustification, justification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.RATING_TYPE__SOURCE:
				return basicSetSource(null, msgs);
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
			case BOMPackage.RATING_TYPE__SOURCE:
				return getSource();
			case BOMPackage.RATING_TYPE__SCORE:
				return getScore();
			case BOMPackage.RATING_TYPE__SEVERITY:
				return getSeverity();
			case BOMPackage.RATING_TYPE__METHOD:
				return getMethod();
			case BOMPackage.RATING_TYPE__VECTOR:
				return getVector();
			case BOMPackage.RATING_TYPE__JUSTIFICATION:
				return getJustification();
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
			case BOMPackage.RATING_TYPE__SOURCE:
				setSource((VulnerabilitySourceType)newValue);
				return;
			case BOMPackage.RATING_TYPE__SCORE:
				setScore((BigDecimal)newValue);
				return;
			case BOMPackage.RATING_TYPE__SEVERITY:
				setSeverity((SeverityType)newValue);
				return;
			case BOMPackage.RATING_TYPE__METHOD:
				setMethod((ScoreSourceType)newValue);
				return;
			case BOMPackage.RATING_TYPE__VECTOR:
				setVector((String)newValue);
				return;
			case BOMPackage.RATING_TYPE__JUSTIFICATION:
				setJustification((String)newValue);
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
			case BOMPackage.RATING_TYPE__SOURCE:
				setSource((VulnerabilitySourceType)null);
				return;
			case BOMPackage.RATING_TYPE__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case BOMPackage.RATING_TYPE__SEVERITY:
				unsetSeverity();
				return;
			case BOMPackage.RATING_TYPE__METHOD:
				unsetMethod();
				return;
			case BOMPackage.RATING_TYPE__VECTOR:
				setVector(VECTOR_EDEFAULT);
				return;
			case BOMPackage.RATING_TYPE__JUSTIFICATION:
				setJustification(JUSTIFICATION_EDEFAULT);
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
			case BOMPackage.RATING_TYPE__SOURCE:
				return source != null;
			case BOMPackage.RATING_TYPE__SCORE:
				return SCORE_EDEFAULT == null ? score != null : !SCORE_EDEFAULT.equals(score);
			case BOMPackage.RATING_TYPE__SEVERITY:
				return isSetSeverity();
			case BOMPackage.RATING_TYPE__METHOD:
				return isSetMethod();
			case BOMPackage.RATING_TYPE__VECTOR:
				return VECTOR_EDEFAULT == null ? vector != null : !VECTOR_EDEFAULT.equals(vector);
			case BOMPackage.RATING_TYPE__JUSTIFICATION:
				return JUSTIFICATION_EDEFAULT == null ? justification != null : !JUSTIFICATION_EDEFAULT.equals(justification);
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
		result.append(" (score: ");
		result.append(score);
		result.append(", severity: ");
		if (severityESet) result.append(severity); else result.append("<unset>");
		result.append(", method: ");
		if (methodESet) result.append(method); else result.append("<unset>");
		result.append(", vector: ");
		result.append(vector);
		result.append(", justification: ");
		result.append(justification);
		result.append(')');
		return result.toString();
	}

} //RatingTypeImpl
