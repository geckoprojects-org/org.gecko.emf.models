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
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Record of transport of item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TransportOutput#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueBase64Binary <em>Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueCanonical <em>Value Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueCode <em>Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueId <em>Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueInstant <em>Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueInteger64 <em>Value Integer64</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueMarkdown <em>Value Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueOid <em>Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValuePositiveInt <em>Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueUnsignedInt <em>Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueUri <em>Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueUrl <em>Value Url</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueUuid <em>Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueAddress <em>Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueAge <em>Value Age</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueAnnotation <em>Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueCodeableReference <em>Value Codeable Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueContactPoint <em>Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueCount <em>Value Count</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueDistance <em>Value Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueDuration <em>Value Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueHumanName <em>Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueIdentifier <em>Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueMoney <em>Value Money</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueRatioRange <em>Value Ratio Range</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueSampledData <em>Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueSignature <em>Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueTiming <em>Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueContactDetail <em>Value Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueDataRequirement <em>Value Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueParameterDefinition <em>Value Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueRelatedArtifact <em>Value Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueTriggerDefinition <em>Value Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueUsageContext <em>Value Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueAvailability <em>Value Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueExtendedContactDetail <em>Value Extended Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueDosage <em>Value Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.TransportOutput#getValueMeta <em>Value Meta</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTransportOutput()
 * @model extendedMetaData="name='Transport.Output' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TransportOutput extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Output parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Base64 Binary</em>' containment reference.
	 * @see #setValueBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getValueBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueBase64Binary <em>Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Base64 Binary</em>' containment reference.
	 * @see #getValueBase64Binary()
	 * @generated
	 */
	void setValueBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Canonical</em>' containment reference.
	 * @see #setValueCanonical(Canonical)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getValueCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueCanonical <em>Value Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Canonical</em>' containment reference.
	 * @see #getValueCanonical()
	 * @generated
	 */
	void setValueCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Code</em>' containment reference.
	 * @see #setValueCode(Code)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getValueCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueCode <em>Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Code</em>' containment reference.
	 * @see #getValueCode()
	 * @generated
	 */
	void setValueCode(Code value);

	/**
	 * Returns the value of the '<em><b>Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date</em>' containment reference.
	 * @see #setValueDate(Date)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueDate <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date</em>' containment reference.
	 * @see #getValueDate()
	 * @generated
	 */
	void setValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date Time</em>' containment reference.
	 * @see #setValueDateTime(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueDateTime <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' containment reference.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Decimal</em>' containment reference.
	 * @see #setValueDecimal(Decimal)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueDecimal <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Decimal</em>' containment reference.
	 * @see #getValueDecimal()
	 * @generated
	 */
	void setValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Id</em>' containment reference.
	 * @see #setValueId(Id)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getValueId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueId <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Id</em>' containment reference.
	 * @see #getValueId()
	 * @generated
	 */
	void setValueId(Id value);

	/**
	 * Returns the value of the '<em><b>Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Instant</em>' containment reference.
	 * @see #setValueInstant(Instant)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueInstant <em>Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Instant</em>' containment reference.
	 * @see #getValueInstant()
	 * @generated
	 */
	void setValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer</em>' containment reference.
	 * @see #setValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueInteger <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer</em>' containment reference.
	 * @see #getValueInteger()
	 * @generated
	 */
	void setValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Value Integer64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer64</em>' containment reference.
	 * @see #setValueInteger64(Integer64)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueInteger64()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInteger64' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer64 getValueInteger64();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueInteger64 <em>Value Integer64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer64</em>' containment reference.
	 * @see #getValueInteger64()
	 * @generated
	 */
	void setValueInteger64(Integer64 value);

	/**
	 * Returns the value of the '<em><b>Value Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Markdown</em>' containment reference.
	 * @see #setValueMarkdown(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getValueMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueMarkdown <em>Value Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Markdown</em>' containment reference.
	 * @see #getValueMarkdown()
	 * @generated
	 */
	void setValueMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Value Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Oid</em>' containment reference.
	 * @see #setValueOid(Oid)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getValueOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueOid <em>Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Oid</em>' containment reference.
	 * @see #getValueOid()
	 * @generated
	 */
	void setValueOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Positive Int</em>' containment reference.
	 * @see #setValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValuePositiveInt <em>Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Positive Int</em>' containment reference.
	 * @see #getValuePositiveInt()
	 * @generated
	 */
	void setValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' containment reference.
	 * @see #setValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueString <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' containment reference.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Time</em>' containment reference.
	 * @see #setValueTime(Time)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueTime <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Time</em>' containment reference.
	 * @see #getValueTime()
	 * @generated
	 */
	void setValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Unsigned Int</em>' containment reference.
	 * @see #setValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueUnsignedInt <em>Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Unsigned Int</em>' containment reference.
	 * @see #getValueUnsignedInt()
	 * @generated
	 */
	void setValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Uri</em>' containment reference.
	 * @see #setValueUri(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueUri <em>Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uri</em>' containment reference.
	 * @see #getValueUri()
	 * @generated
	 */
	void setValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Url</em>' containment reference.
	 * @see #setValueUrl(Url)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getValueUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueUrl <em>Value Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Url</em>' containment reference.
	 * @see #getValueUrl()
	 * @generated
	 */
	void setValueUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Value Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Uuid</em>' containment reference.
	 * @see #setValueUuid(Uuid)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getValueUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueUuid <em>Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uuid</em>' containment reference.
	 * @see #getValueUuid()
	 * @generated
	 */
	void setValueUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Address</em>' containment reference.
	 * @see #setValueAddress(Address)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getValueAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueAddress <em>Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Address</em>' containment reference.
	 * @see #getValueAddress()
	 * @generated
	 */
	void setValueAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Value Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Age</em>' containment reference.
	 * @see #setValueAge(Age)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getValueAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueAge <em>Value Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Age</em>' containment reference.
	 * @see #getValueAge()
	 * @generated
	 */
	void setValueAge(Age value);

	/**
	 * Returns the value of the '<em><b>Value Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Annotation</em>' containment reference.
	 * @see #setValueAnnotation(Annotation)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getValueAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueAnnotation <em>Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Annotation</em>' containment reference.
	 * @see #getValueAnnotation()
	 * @generated
	 */
	void setValueAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attachment</em>' containment reference.
	 * @see #setValueAttachment(Attachment)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueAttachment <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attachment</em>' containment reference.
	 * @see #getValueAttachment()
	 * @generated
	 */
	void setValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #setValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #getValueCodeableConcept()
	 * @generated
	 */
	void setValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Codeable Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Reference</em>' containment reference.
	 * @see #setValueCodeableReference(CodeableReference)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueCodeableReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableReference' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getValueCodeableReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueCodeableReference <em>Value Codeable Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Reference</em>' containment reference.
	 * @see #getValueCodeableReference()
	 * @generated
	 */
	void setValueCodeableReference(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Coding</em>' containment reference.
	 * @see #setValueCoding(Coding)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueCoding <em>Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Coding</em>' containment reference.
	 * @see #getValueCoding()
	 * @generated
	 */
	void setValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Value Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Contact Point</em>' containment reference.
	 * @see #setValueContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getValueContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueContactPoint <em>Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Contact Point</em>' containment reference.
	 * @see #getValueContactPoint()
	 * @generated
	 */
	void setValueContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Value Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Count</em>' containment reference.
	 * @see #setValueCount(Count)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCount' namespace='##targetNamespace'"
	 * @generated
	 */
	Count getValueCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueCount <em>Value Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Count</em>' containment reference.
	 * @see #getValueCount()
	 * @generated
	 */
	void setValueCount(Count value);

	/**
	 * Returns the value of the '<em><b>Value Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Distance</em>' containment reference.
	 * @see #setValueDistance(Distance)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	Distance getValueDistance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueDistance <em>Value Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Distance</em>' containment reference.
	 * @see #getValueDistance()
	 * @generated
	 */
	void setValueDistance(Distance value);

	/**
	 * Returns the value of the '<em><b>Value Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Duration</em>' containment reference.
	 * @see #setValueDuration(Duration)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getValueDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueDuration <em>Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Duration</em>' containment reference.
	 * @see #getValueDuration()
	 * @generated
	 */
	void setValueDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Value Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Human Name</em>' containment reference.
	 * @see #setValueHumanName(HumanName)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getValueHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueHumanName <em>Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Human Name</em>' containment reference.
	 * @see #getValueHumanName()
	 * @generated
	 */
	void setValueHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Identifier</em>' containment reference.
	 * @see #setValueIdentifier(Identifier)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getValueIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueIdentifier <em>Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Identifier</em>' containment reference.
	 * @see #getValueIdentifier()
	 * @generated
	 */
	void setValueIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Value Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Money</em>' containment reference.
	 * @see #setValueMoney(Money)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getValueMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueMoney <em>Value Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Money</em>' containment reference.
	 * @see #getValueMoney()
	 * @generated
	 */
	void setValueMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Period</em>' containment reference.
	 * @see #setValuePeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValuePeriod <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Period</em>' containment reference.
	 * @see #getValuePeriod()
	 * @generated
	 */
	void setValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(Range)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ratio</em>' containment reference.
	 * @see #setValueRatio(Ratio)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueRatio <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ratio</em>' containment reference.
	 * @see #getValueRatio()
	 * @generated
	 */
	void setValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Value Ratio Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ratio Range</em>' containment reference.
	 * @see #setValueRatioRange(RatioRange)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueRatioRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRatioRange' namespace='##targetNamespace'"
	 * @generated
	 */
	RatioRange getValueRatioRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueRatioRange <em>Value Ratio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ratio Range</em>' containment reference.
	 * @see #getValueRatioRange()
	 * @generated
	 */
	void setValueRatioRange(RatioRange value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Reference</em>' containment reference.
	 * @see #setValueReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueReference <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' containment reference.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Value Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sampled Data</em>' containment reference.
	 * @see #setValueSampledData(SampledData)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getValueSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueSampledData <em>Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Sampled Data</em>' containment reference.
	 * @see #getValueSampledData()
	 * @generated
	 */
	void setValueSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Value Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Signature</em>' containment reference.
	 * @see #setValueSignature(Signature)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getValueSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueSignature <em>Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Signature</em>' containment reference.
	 * @see #getValueSignature()
	 * @generated
	 */
	void setValueSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Value Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Timing</em>' containment reference.
	 * @see #setValueTiming(Timing)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getValueTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueTiming <em>Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Timing</em>' containment reference.
	 * @see #getValueTiming()
	 * @generated
	 */
	void setValueTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Value Contact Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Contact Detail</em>' containment reference.
	 * @see #setValueContactDetail(ContactDetail)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueContactDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueContactDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactDetail getValueContactDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueContactDetail <em>Value Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Contact Detail</em>' containment reference.
	 * @see #getValueContactDetail()
	 * @generated
	 */
	void setValueContactDetail(ContactDetail value);

	/**
	 * Returns the value of the '<em><b>Value Data Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Data Requirement</em>' containment reference.
	 * @see #setValueDataRequirement(DataRequirement)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueDataRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDataRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getValueDataRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueDataRequirement <em>Value Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Data Requirement</em>' containment reference.
	 * @see #getValueDataRequirement()
	 * @generated
	 */
	void setValueDataRequirement(DataRequirement value);

	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Expression</em>' containment reference.
	 * @see #setValueExpression(Expression)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueExpression <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' containment reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Value Parameter Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Parameter Definition</em>' containment reference.
	 * @see #setValueParameterDefinition(ParameterDefinition)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueParameterDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueParameterDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterDefinition getValueParameterDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueParameterDefinition <em>Value Parameter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Parameter Definition</em>' containment reference.
	 * @see #getValueParameterDefinition()
	 * @generated
	 */
	void setValueParameterDefinition(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Value Related Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Related Artifact</em>' containment reference.
	 * @see #setValueRelatedArtifact(RelatedArtifact)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueRelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRelatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedArtifact getValueRelatedArtifact();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueRelatedArtifact <em>Value Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Related Artifact</em>' containment reference.
	 * @see #getValueRelatedArtifact()
	 * @generated
	 */
	void setValueRelatedArtifact(RelatedArtifact value);

	/**
	 * Returns the value of the '<em><b>Value Trigger Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Trigger Definition</em>' containment reference.
	 * @see #setValueTriggerDefinition(TriggerDefinition)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueTriggerDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTriggerDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerDefinition getValueTriggerDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueTriggerDefinition <em>Value Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Trigger Definition</em>' containment reference.
	 * @see #getValueTriggerDefinition()
	 * @generated
	 */
	void setValueTriggerDefinition(TriggerDefinition value);

	/**
	 * Returns the value of the '<em><b>Value Usage Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Usage Context</em>' containment reference.
	 * @see #setValueUsageContext(UsageContext)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueUsageContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUsageContext' namespace='##targetNamespace'"
	 * @generated
	 */
	UsageContext getValueUsageContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueUsageContext <em>Value Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Usage Context</em>' containment reference.
	 * @see #getValueUsageContext()
	 * @generated
	 */
	void setValueUsageContext(UsageContext value);

	/**
	 * Returns the value of the '<em><b>Value Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Availability</em>' containment reference.
	 * @see #setValueAvailability(Availability)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueAvailability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	Availability getValueAvailability();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueAvailability <em>Value Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Availability</em>' containment reference.
	 * @see #getValueAvailability()
	 * @generated
	 */
	void setValueAvailability(Availability value);

	/**
	 * Returns the value of the '<em><b>Value Extended Contact Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Extended Contact Detail</em>' containment reference.
	 * @see #setValueExtendedContactDetail(ExtendedContactDetail)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueExtendedContactDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueExtendedContactDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedContactDetail getValueExtendedContactDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueExtendedContactDetail <em>Value Extended Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Extended Contact Detail</em>' containment reference.
	 * @see #getValueExtendedContactDetail()
	 * @generated
	 */
	void setValueExtendedContactDetail(ExtendedContactDetail value);

	/**
	 * Returns the value of the '<em><b>Value Dosage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Dosage</em>' containment reference.
	 * @see #setValueDosage(Dosage)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueDosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDosage' namespace='##targetNamespace'"
	 * @generated
	 */
	Dosage getValueDosage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueDosage <em>Value Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Dosage</em>' containment reference.
	 * @see #getValueDosage()
	 * @generated
	 */
	void setValueDosage(Dosage value);

	/**
	 * Returns the value of the '<em><b>Value Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Meta</em>' containment reference.
	 * @see #setValueMeta(Meta)
	 * @see org.hl7.fhir.FHIRPackage#getTransportOutput_ValueMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getValueMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TransportOutput#getValueMeta <em>Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Meta</em>' containment reference.
	 * @see #getValueMeta()
	 * @generated
	 */
	void setValueMeta(Meta value);

} // TransportOutput
