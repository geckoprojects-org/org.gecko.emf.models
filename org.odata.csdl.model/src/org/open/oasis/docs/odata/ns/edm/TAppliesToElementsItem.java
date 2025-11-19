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
package org.open.oasis.docs.odata.ns.edm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TApplies To Elements Item</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAppliesToElementsItem()
 * @model extendedMetaData="name='TAppliesToElements_._item'"
 * @generated
 */
@ProviderType
public enum TAppliesToElementsItem implements Enumerator {
	/**
	 * The '<em><b>Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION(0, "Action", "Action"),

	/**
	 * The '<em><b>Action Import</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_IMPORT_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_IMPORT(1, "ActionImport", "ActionImport"),

	/**
	 * The '<em><b>Annotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATION(2, "Annotation", "Annotation"),

	/**
	 * The '<em><b>Apply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_VALUE
	 * @generated
	 * @ordered
	 */
	APPLY(3, "Apply", "Apply"),

	/**
	 * The '<em><b>Cast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAST_VALUE
	 * @generated
	 * @ordered
	 */
	CAST(4, "Cast", "Cast"),

	/**
	 * The '<em><b>Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION(5, "Collection", "Collection"),

	/**
	 * The '<em><b>Complex Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEX_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEX_TYPE(6, "ComplexType", "ComplexType"),

	/**
	 * The '<em><b>Entity Container</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY_CONTAINER(7, "EntityContainer", "EntityContainer"),

	/**
	 * The '<em><b>Entity Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_SET_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY_SET(8, "EntitySet", "EntitySet"),

	/**
	 * The '<em><b>Entity Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY_TYPE(9, "EntityType", "EntityType"),

	/**
	 * The '<em><b>Enum Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_TYPE(10, "EnumType", "EnumType"),

	/**
	 * The '<em><b>Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(11, "Function", "Function"),

	/**
	 * The '<em><b>Function Import</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_IMPORT_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_IMPORT(12, "FunctionImport", "FunctionImport"),

	/**
	 * The '<em><b>If</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF_VALUE
	 * @generated
	 * @ordered
	 */
	IF(13, "If", "If"),

	/**
	 * The '<em><b>Include</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDE(14, "Include", "Include"),

	/**
	 * The '<em><b>Is Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_OF(15, "IsOf", "IsOf"),

	/**
	 * The '<em><b>Labeled Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABELED_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	LABELED_ELEMENT(16, "LabeledElement", "LabeledElement"),

	/**
	 * The '<em><b>Member</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBER(17, "Member", "Member"),

	/**
	 * The '<em><b>Navigation Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATION_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATION_PROPERTY(18, "NavigationProperty", "NavigationProperty"),

	/**
	 * The '<em><b>Null</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(19, "Null", "Null"),

	/**
	 * The '<em><b>On Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	ON_DELETE(20, "OnDelete", "OnDelete"),

	/**
	 * The '<em><b>Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER(21, "Parameter", "Parameter"),

	/**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE_
	 * @generated
	 * @ordered
	 */
	PROPERTY(22, "Property", "Property"),

	/**
	 * The '<em><b>Property Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY_VALUE(23, "PropertyValue", "PropertyValue"),

	/**
	 * The '<em><b>Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD(24, "Record", "Record"),

	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(25, "Reference", "Reference"),

	/**
	 * The '<em><b>Referential Constraint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENTIAL_CONSTRAINT_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENTIAL_CONSTRAINT(26, "ReferentialConstraint", "ReferentialConstraint"),

	/**
	 * The '<em><b>Return Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	RETURN_TYPE(27, "ReturnType", "ReturnType"),

	/**
	 * The '<em><b>Schema</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMA_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEMA(28, "Schema", "Schema"),

	/**
	 * The '<em><b>Singleton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLETON_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLETON(29, "Singleton", "Singleton"),

	/**
	 * The '<em><b>Term</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERM_VALUE
	 * @generated
	 * @ordered
	 */
	TERM(30, "Term", "Term"),

	/**
	 * The '<em><b>Type Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_DEFINITION(31, "TypeDefinition", "TypeDefinition"),

	/**
	 * The '<em><b>Url Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_REF_VALUE
	 * @generated
	 * @ordered
	 */
	URL_REF(32, "UrlRef", "UrlRef");

	/**
	 * The '<em><b>Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION
	 * @model name="Action"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_VALUE = 0;

	/**
	 * The '<em><b>Action Import</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_IMPORT
	 * @model name="ActionImport"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_IMPORT_VALUE = 1;

	/**
	 * The '<em><b>Annotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATION
	 * @model name="Annotation"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_VALUE = 2;

	/**
	 * The '<em><b>Apply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY
	 * @model name="Apply"
	 * @generated
	 * @ordered
	 */
	public static final int APPLY_VALUE = 3;

	/**
	 * The '<em><b>Cast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAST
	 * @model name="Cast"
	 * @generated
	 * @ordered
	 */
	public static final int CAST_VALUE = 4;

	/**
	 * The '<em><b>Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION
	 * @model name="Collection"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_VALUE = 5;

	/**
	 * The '<em><b>Complex Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEX_TYPE
	 * @model name="ComplexType"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEX_TYPE_VALUE = 6;

	/**
	 * The '<em><b>Entity Container</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_CONTAINER
	 * @model name="EntityContainer"
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_CONTAINER_VALUE = 7;

	/**
	 * The '<em><b>Entity Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_SET
	 * @model name="EntitySet"
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_SET_VALUE = 8;

	/**
	 * The '<em><b>Entity Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_TYPE
	 * @model name="EntityType"
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_TYPE_VALUE = 9;

	/**
	 * The '<em><b>Enum Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_TYPE
	 * @model name="EnumType"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_TYPE_VALUE = 10;

	/**
	 * The '<em><b>Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model name="Function"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 11;

	/**
	 * The '<em><b>Function Import</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_IMPORT
	 * @model name="FunctionImport"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_IMPORT_VALUE = 12;

	/**
	 * The '<em><b>If</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF
	 * @model name="If"
	 * @generated
	 * @ordered
	 */
	public static final int IF_VALUE = 13;

	/**
	 * The '<em><b>Include</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE
	 * @model name="Include"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDE_VALUE = 14;

	/**
	 * The '<em><b>Is Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_OF
	 * @model name="IsOf"
	 * @generated
	 * @ordered
	 */
	public static final int IS_OF_VALUE = 15;

	/**
	 * The '<em><b>Labeled Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABELED_ELEMENT
	 * @model name="LabeledElement"
	 * @generated
	 * @ordered
	 */
	public static final int LABELED_ELEMENT_VALUE = 16;

	/**
	 * The '<em><b>Member</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER
	 * @model name="Member"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBER_VALUE = 17;

	/**
	 * The '<em><b>Navigation Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATION_PROPERTY
	 * @model name="NavigationProperty"
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATION_PROPERTY_VALUE = 18;

	/**
	 * The '<em><b>Null</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model name="Null"
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 19;

	/**
	 * The '<em><b>On Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_DELETE
	 * @model name="OnDelete"
	 * @generated
	 * @ordered
	 */
	public static final int ON_DELETE_VALUE = 20;

	/**
	 * The '<em><b>Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER
	 * @model name="Parameter"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE = 21;

	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model name="Property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE_ = 22;

	/**
	 * The '<em><b>Property Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @model name="PropertyValue"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE_VALUE = 23;

	/**
	 * The '<em><b>Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD
	 * @model name="Record"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_VALUE = 24;

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE
	 * @model name="Reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 25;

	/**
	 * The '<em><b>Referential Constraint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENTIAL_CONSTRAINT
	 * @model name="ReferentialConstraint"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENTIAL_CONSTRAINT_VALUE = 26;

	/**
	 * The '<em><b>Return Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_TYPE
	 * @model name="ReturnType"
	 * @generated
	 * @ordered
	 */
	public static final int RETURN_TYPE_VALUE = 27;

	/**
	 * The '<em><b>Schema</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMA
	 * @model name="Schema"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEMA_VALUE = 28;

	/**
	 * The '<em><b>Singleton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLETON
	 * @model name="Singleton"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLETON_VALUE = 29;

	/**
	 * The '<em><b>Term</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERM
	 * @model name="Term"
	 * @generated
	 * @ordered
	 */
	public static final int TERM_VALUE = 30;

	/**
	 * The '<em><b>Type Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_DEFINITION
	 * @model name="TypeDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_DEFINITION_VALUE = 31;

	/**
	 * The '<em><b>Url Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_REF
	 * @model name="UrlRef"
	 * @generated
	 * @ordered
	 */
	public static final int URL_REF_VALUE = 32;

	/**
	 * An array of all the '<em><b>TApplies To Elements Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TAppliesToElementsItem[] VALUES_ARRAY =
		new TAppliesToElementsItem[] {
			ACTION,
			ACTION_IMPORT,
			ANNOTATION,
			APPLY,
			CAST,
			COLLECTION,
			COMPLEX_TYPE,
			ENTITY_CONTAINER,
			ENTITY_SET,
			ENTITY_TYPE,
			ENUM_TYPE,
			FUNCTION,
			FUNCTION_IMPORT,
			IF,
			INCLUDE,
			IS_OF,
			LABELED_ELEMENT,
			MEMBER,
			NAVIGATION_PROPERTY,
			NULL,
			ON_DELETE,
			PARAMETER,
			PROPERTY,
			PROPERTY_VALUE,
			RECORD,
			REFERENCE,
			REFERENTIAL_CONSTRAINT,
			RETURN_TYPE,
			SCHEMA,
			SINGLETON,
			TERM,
			TYPE_DEFINITION,
			URL_REF,
		};

	/**
	 * A public read-only list of all the '<em><b>TApplies To Elements Item</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TAppliesToElementsItem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TApplies To Elements Item</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TAppliesToElementsItem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TAppliesToElementsItem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TApplies To Elements Item</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TAppliesToElementsItem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TAppliesToElementsItem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TApplies To Elements Item</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TAppliesToElementsItem get(int value) {
		switch (value) {
			case ACTION_VALUE: return ACTION;
			case ACTION_IMPORT_VALUE: return ACTION_IMPORT;
			case ANNOTATION_VALUE: return ANNOTATION;
			case APPLY_VALUE: return APPLY;
			case CAST_VALUE: return CAST;
			case COLLECTION_VALUE: return COLLECTION;
			case COMPLEX_TYPE_VALUE: return COMPLEX_TYPE;
			case ENTITY_CONTAINER_VALUE: return ENTITY_CONTAINER;
			case ENTITY_SET_VALUE: return ENTITY_SET;
			case ENTITY_TYPE_VALUE: return ENTITY_TYPE;
			case ENUM_TYPE_VALUE: return ENUM_TYPE;
			case FUNCTION_VALUE: return FUNCTION;
			case FUNCTION_IMPORT_VALUE: return FUNCTION_IMPORT;
			case IF_VALUE: return IF;
			case INCLUDE_VALUE: return INCLUDE;
			case IS_OF_VALUE: return IS_OF;
			case LABELED_ELEMENT_VALUE: return LABELED_ELEMENT;
			case MEMBER_VALUE: return MEMBER;
			case NAVIGATION_PROPERTY_VALUE: return NAVIGATION_PROPERTY;
			case NULL_VALUE: return NULL;
			case ON_DELETE_VALUE: return ON_DELETE;
			case PARAMETER_VALUE: return PARAMETER;
			case PROPERTY_VALUE_: return PROPERTY;
			case PROPERTY_VALUE_VALUE: return PROPERTY_VALUE;
			case RECORD_VALUE: return RECORD;
			case REFERENCE_VALUE: return REFERENCE;
			case REFERENTIAL_CONSTRAINT_VALUE: return REFERENTIAL_CONSTRAINT;
			case RETURN_TYPE_VALUE: return RETURN_TYPE;
			case SCHEMA_VALUE: return SCHEMA;
			case SINGLETON_VALUE: return SINGLETON;
			case TERM_VALUE: return TERM;
			case TYPE_DEFINITION_VALUE: return TYPE_DEFINITION;
			case URL_REF_VALUE: return URL_REF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TAppliesToElementsItem(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TAppliesToElementsItem
