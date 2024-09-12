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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Canonical;
import org.hl7.fhir.Coding;
import org.hl7.fhir.EnableWhenBehavior;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.QuestionnaireAnswerConstraint;
import org.hl7.fhir.QuestionnaireAnswerOption;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireInitial;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemDisabledDisplay;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getEnableBehavior <em>Enable Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getDisabledDisplay <em>Disabled Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getAnswerConstraint <em>Answer Constraint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getAnswerValueSet <em>Answer Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getAnswerOption <em>Answer Option</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireItemImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireItemImpl extends BackboneElementImpl implements QuestionnaireItem {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String linkId;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> code;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String prefix;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireItemType type;

	/**
	 * The cached value of the '{@link #getEnableWhen() <em>Enable When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableWhen()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireEnableWhen> enableWhen;

	/**
	 * The cached value of the '{@link #getEnableBehavior() <em>Enable Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableBehavior()
	 * @generated
	 * @ordered
	 */
	protected EnableWhenBehavior enableBehavior;

	/**
	 * The cached value of the '{@link #getDisabledDisplay() <em>Disabled Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledDisplay()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireItemDisabledDisplay disabledDisplay;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean required;

	/**
	 * The cached value of the '{@link #getRepeats() <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeats()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean repeats;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean readOnly;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer maxLength;

	/**
	 * The cached value of the '{@link #getAnswerConstraint() <em>Answer Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerConstraint()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireAnswerConstraint answerConstraint;

	/**
	 * The cached value of the '{@link #getAnswerValueSet() <em>Answer Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerValueSet()
	 * @generated
	 * @ordered
	 */
	protected Canonical answerValueSet;

	/**
	 * The cached value of the '{@link #getAnswerOption() <em>Answer Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerOption()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireAnswerOption> answerOption;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireInitial> initial;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getQuestionnaireItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID, oldLinkId, newLinkId);
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
	public void setLinkId(org.hl7.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Uri newDefinition, NotificationChain msgs) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION, oldDefinition, newDefinition);
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
	public void setDefinition(Uri newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<Coding>(Coding.class, this, FHIRPackage.QUESTIONNAIRE_ITEM__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(org.hl7.fhir.String newPrefix, NotificationChain msgs) {
		org.hl7.fhir.String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX, oldPrefix, newPrefix);
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
	public void setPrefix(org.hl7.fhir.String newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX, newPrefix, newPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__TEXT, oldText, newText);
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
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItemType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(QuestionnaireItemType newType, NotificationChain msgs) {
		QuestionnaireItemType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__TYPE, oldType, newType);
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
	public void setType(QuestionnaireItemType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionnaireEnableWhen> getEnableWhen() {
		if (enableWhen == null) {
			enableWhen = new EObjectContainmentEList<QuestionnaireEnableWhen>(QuestionnaireEnableWhen.class, this, FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN);
		}
		return enableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableWhenBehavior getEnableBehavior() {
		return enableBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableBehavior(EnableWhenBehavior newEnableBehavior, NotificationChain msgs) {
		EnableWhenBehavior oldEnableBehavior = enableBehavior;
		enableBehavior = newEnableBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR, oldEnableBehavior, newEnableBehavior);
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
	public void setEnableBehavior(EnableWhenBehavior newEnableBehavior) {
		if (newEnableBehavior != enableBehavior) {
			NotificationChain msgs = null;
			if (enableBehavior != null)
				msgs = ((InternalEObject)enableBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR, null, msgs);
			if (newEnableBehavior != null)
				msgs = ((InternalEObject)newEnableBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR, null, msgs);
			msgs = basicSetEnableBehavior(newEnableBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR, newEnableBehavior, newEnableBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItemDisabledDisplay getDisabledDisplay() {
		return disabledDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisabledDisplay(QuestionnaireItemDisabledDisplay newDisabledDisplay, NotificationChain msgs) {
		QuestionnaireItemDisabledDisplay oldDisabledDisplay = disabledDisplay;
		disabledDisplay = newDisabledDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY, oldDisabledDisplay, newDisabledDisplay);
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
	public void setDisabledDisplay(QuestionnaireItemDisabledDisplay newDisabledDisplay) {
		if (newDisabledDisplay != disabledDisplay) {
			NotificationChain msgs = null;
			if (disabledDisplay != null)
				msgs = ((InternalEObject)disabledDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY, null, msgs);
			if (newDisabledDisplay != null)
				msgs = ((InternalEObject)newDisabledDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY, null, msgs);
			msgs = basicSetDisabledDisplay(newDisabledDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY, newDisabledDisplay, newDisabledDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.hl7.fhir.Boolean newRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED, oldRequired, newRequired);
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
	public void setRequired(org.hl7.fhir.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getRepeats() {
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeats(org.hl7.fhir.Boolean newRepeats, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRepeats = repeats;
		repeats = newRepeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS, oldRepeats, newRepeats);
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
	public void setRepeats(org.hl7.fhir.Boolean newRepeats) {
		if (newRepeats != repeats) {
			NotificationChain msgs = null;
			if (repeats != null)
				msgs = ((InternalEObject)repeats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS, null, msgs);
			if (newRepeats != null)
				msgs = ((InternalEObject)newRepeats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS, null, msgs);
			msgs = basicSetRepeats(newRepeats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS, newRepeats, newRepeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadOnly(org.hl7.fhir.Boolean newReadOnly, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY, oldReadOnly, newReadOnly);
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
	public void setReadOnly(org.hl7.fhir.Boolean newReadOnly) {
		if (newReadOnly != readOnly) {
			NotificationChain msgs = null;
			if (readOnly != null)
				msgs = ((InternalEObject)readOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY, null, msgs);
			if (newReadOnly != null)
				msgs = ((InternalEObject)newReadOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY, null, msgs);
			msgs = basicSetReadOnly(newReadOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY, newReadOnly, newReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(org.hl7.fhir.Integer newMaxLength, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, oldMaxLength, newMaxLength);
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
	public void setMaxLength(org.hl7.fhir.Integer newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject)maxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, null, msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject)newMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, null, msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireAnswerConstraint getAnswerConstraint() {
		return answerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerConstraint(QuestionnaireAnswerConstraint newAnswerConstraint, NotificationChain msgs) {
		QuestionnaireAnswerConstraint oldAnswerConstraint = answerConstraint;
		answerConstraint = newAnswerConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT, oldAnswerConstraint, newAnswerConstraint);
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
	public void setAnswerConstraint(QuestionnaireAnswerConstraint newAnswerConstraint) {
		if (newAnswerConstraint != answerConstraint) {
			NotificationChain msgs = null;
			if (answerConstraint != null)
				msgs = ((InternalEObject)answerConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT, null, msgs);
			if (newAnswerConstraint != null)
				msgs = ((InternalEObject)newAnswerConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT, null, msgs);
			msgs = basicSetAnswerConstraint(newAnswerConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT, newAnswerConstraint, newAnswerConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getAnswerValueSet() {
		return answerValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerValueSet(Canonical newAnswerValueSet, NotificationChain msgs) {
		Canonical oldAnswerValueSet = answerValueSet;
		answerValueSet = newAnswerValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET, oldAnswerValueSet, newAnswerValueSet);
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
	public void setAnswerValueSet(Canonical newAnswerValueSet) {
		if (newAnswerValueSet != answerValueSet) {
			NotificationChain msgs = null;
			if (answerValueSet != null)
				msgs = ((InternalEObject)answerValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET, null, msgs);
			if (newAnswerValueSet != null)
				msgs = ((InternalEObject)newAnswerValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET, null, msgs);
			msgs = basicSetAnswerValueSet(newAnswerValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET, newAnswerValueSet, newAnswerValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionnaireAnswerOption> getAnswerOption() {
		if (answerOption == null) {
			answerOption = new EObjectContainmentEList<QuestionnaireAnswerOption>(QuestionnaireAnswerOption.class, this, FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION);
		}
		return answerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionnaireInitial> getInitial() {
		if (initial == null) {
			initial = new EObjectContainmentEList<QuestionnaireInitial>(QuestionnaireInitial.class, this, FHIRPackage.QUESTIONNAIRE_ITEM__INITIAL);
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionnaireItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<QuestionnaireItem>(QuestionnaireItem.class, this, FHIRPackage.QUESTIONNAIRE_ITEM__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return basicSetPrefix(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__TEXT:
				return basicSetText(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return ((InternalEList<?>)getEnableWhen()).basicRemove(otherEnd, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				return basicSetEnableBehavior(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY:
				return basicSetDisabledDisplay(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return basicSetRequired(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return basicSetRepeats(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return basicSetReadOnly(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return basicSetMaxLength(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT:
				return basicSetAnswerConstraint(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				return basicSetAnswerValueSet(null, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				return ((InternalEList<?>)getAnswerOption()).basicRemove(otherEnd, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__INITIAL:
				return ((InternalEList<?>)getInitial()).basicRemove(otherEnd, msgs);
			case FHIRPackage.QUESTIONNAIRE_ITEM__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return getLinkId();
			case FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				return getDefinition();
			case FHIRPackage.QUESTIONNAIRE_ITEM__CODE:
				return getCode();
			case FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return getPrefix();
			case FHIRPackage.QUESTIONNAIRE_ITEM__TEXT:
				return getText();
			case FHIRPackage.QUESTIONNAIRE_ITEM__TYPE:
				return getType();
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return getEnableWhen();
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				return getEnableBehavior();
			case FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY:
				return getDisabledDisplay();
			case FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return getRequired();
			case FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return getRepeats();
			case FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return getReadOnly();
			case FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return getMaxLength();
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT:
				return getAnswerConstraint();
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				return getAnswerValueSet();
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				return getAnswerOption();
			case FHIRPackage.QUESTIONNAIRE_ITEM__INITIAL:
				return getInitial();
			case FHIRPackage.QUESTIONNAIRE_ITEM__ITEM:
				return getItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX:
				setPrefix((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__TYPE:
				setType((QuestionnaireItemType)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				getEnableWhen().clear();
				getEnableWhen().addAll((Collection<? extends QuestionnaireEnableWhen>)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				setEnableBehavior((EnableWhenBehavior)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY:
				setDisabledDisplay((QuestionnaireItemDisabledDisplay)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS:
				setRepeats((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				setReadOnly((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				setMaxLength((org.hl7.fhir.Integer)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT:
				setAnswerConstraint((QuestionnaireAnswerConstraint)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				setAnswerValueSet((Canonical)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				getAnswerOption().clear();
				getAnswerOption().addAll((Collection<? extends QuestionnaireAnswerOption>)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__INITIAL:
				getInitial().clear();
				getInitial().addAll((Collection<? extends QuestionnaireInitial>)newValue);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends QuestionnaireItem>)newValue);
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
			case FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				setDefinition((Uri)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__CODE:
				getCode().clear();
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX:
				setPrefix((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__TYPE:
				setType((QuestionnaireItemType)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				getEnableWhen().clear();
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				setEnableBehavior((EnableWhenBehavior)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY:
				setDisabledDisplay((QuestionnaireItemDisabledDisplay)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS:
				setRepeats((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				setReadOnly((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				setMaxLength((org.hl7.fhir.Integer)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT:
				setAnswerConstraint((QuestionnaireAnswerConstraint)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				setAnswerValueSet((Canonical)null);
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				getAnswerOption().clear();
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__INITIAL:
				getInitial().clear();
				return;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ITEM:
				getItem().clear();
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
			case FHIRPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return linkId != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				return definition != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__CODE:
				return code != null && !code.isEmpty();
			case FHIRPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return prefix != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__TEXT:
				return text != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__TYPE:
				return type != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return enableWhen != null && !enableWhen.isEmpty();
			case FHIRPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				return enableBehavior != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__DISABLED_DISPLAY:
				return disabledDisplay != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return required != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return repeats != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return readOnly != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return maxLength != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_CONSTRAINT:
				return answerConstraint != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				return answerValueSet != null;
			case FHIRPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				return answerOption != null && !answerOption.isEmpty();
			case FHIRPackage.QUESTIONNAIRE_ITEM__INITIAL:
				return initial != null && !initial.isEmpty();
			case FHIRPackage.QUESTIONNAIRE_ITEM__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireItemImpl
