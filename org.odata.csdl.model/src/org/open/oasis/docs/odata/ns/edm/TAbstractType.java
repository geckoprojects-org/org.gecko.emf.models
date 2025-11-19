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
 * A representation of the literals of the enumeration '<em><b>TAbstract Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTAbstractType()
 * @model extendedMetaData="name='TAbstractType'"
 * @generated
 */
@ProviderType
public enum TAbstractType implements Enumerator {
	/**
	 * The '<em><b>Edm Complex Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_COMPLEX_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_COMPLEX_TYPE(0, "EdmComplexType", "Edm.ComplexType"),

	/**
	 * The '<em><b>Edm Entity Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_ENTITY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_ENTITY_TYPE(1, "EdmEntityType", "Edm.EntityType"),

	/**
	 * The '<em><b>Edm Primitive Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_PRIMITIVE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_PRIMITIVE_TYPE(2, "EdmPrimitiveType", "Edm.PrimitiveType"),

	/**
	 * The '<em><b>Edm Untyped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_UNTYPED_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_UNTYPED(3, "EdmUntyped", "Edm.Untyped"),

	/**
	 * The '<em><b>Edm Geography</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOGRAPHY(4, "EdmGeography", "Edm.Geography"),

	/**
	 * The '<em><b>Edm Geometry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOMETRY(5, "EdmGeometry", "Edm.Geometry"),

	/**
	 * The '<em><b>Edm Annotation Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_ANNOTATION_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_ANNOTATION_PATH(6, "EdmAnnotationPath", "Edm.AnnotationPath"),

	/**
	 * The '<em><b>Edm Any Property Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_ANY_PROPERTY_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_ANY_PROPERTY_PATH(7, "EdmAnyPropertyPath", "Edm.AnyPropertyPath"),

	/**
	 * The '<em><b>Edm Model Element Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_MODEL_ELEMENT_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_MODEL_ELEMENT_PATH(8, "EdmModelElementPath", "Edm.ModelElementPath"),

	/**
	 * The '<em><b>Edm Navigation Property Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_NAVIGATION_PROPERTY_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_NAVIGATION_PROPERTY_PATH(9, "EdmNavigationPropertyPath", "Edm.NavigationPropertyPath"),

	/**
	 * The '<em><b>Edm Property Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_PROPERTY_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_PROPERTY_PATH(10, "EdmPropertyPath", "Edm.PropertyPath"),

	/**
	 * The '<em><b>Collection Edm Complex Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_COMPLEX_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_COMPLEX_TYPE(11, "CollectionEdmComplexType", "Collection(Edm.ComplexType)"),

	/**
	 * The '<em><b>Collection Edm Entity Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_ENTITY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_ENTITY_TYPE(12, "CollectionEdmEntityType", "Collection(Edm.EntityType)"),

	/**
	 * The '<em><b>Collection Edm Primitive Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_PRIMITIVE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_PRIMITIVE_TYPE(13, "CollectionEdmPrimitiveType", "Collection(Edm.PrimitiveType)"),

	/**
	 * The '<em><b>Collection Edm Untyped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_UNTYPED_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_UNTYPED(14, "CollectionEdmUntyped", "Collection(Edm.Untyped)"),

	/**
	 * The '<em><b>Collection Edm Geography</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOGRAPHY(15, "CollectionEdmGeography", "Collection(Edm.Geography)"),

	/**
	 * The '<em><b>Collection Edm Geometry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOMETRY(16, "CollectionEdmGeometry", "Collection(Edm.Geometry)"),

	/**
	 * The '<em><b>Collection Edm Annotation Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_ANNOTATION_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_ANNOTATION_PATH(17, "CollectionEdmAnnotationPath", "Collection(Edm.AnnotationPath)"),

	/**
	 * The '<em><b>Collection Edm Any Property Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_ANY_PROPERTY_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_ANY_PROPERTY_PATH(18, "CollectionEdmAnyPropertyPath", "Collection(Edm.AnyPropertyPath)"),

	/**
	 * The '<em><b>Collection Edm Model Element Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_MODEL_ELEMENT_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_MODEL_ELEMENT_PATH(19, "CollectionEdmModelElementPath", "Collection(Edm.ModelElementPath)"),

	/**
	 * The '<em><b>Collection Edm Navigation Property Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_NAVIGATION_PROPERTY_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_NAVIGATION_PROPERTY_PATH(20, "CollectionEdmNavigationPropertyPath", "Collection(Edm.NavigationPropertyPath)"),

	/**
	 * The '<em><b>Collection Edm Property Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_PROPERTY_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_PROPERTY_PATH(21, "CollectionEdmPropertyPath", "Collection(Edm.PropertyPath)");

	/**
	 * The '<em><b>Edm Complex Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_COMPLEX_TYPE
	 * @model name="EdmComplexType" literal="Edm.ComplexType"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_COMPLEX_TYPE_VALUE = 0;

	/**
	 * The '<em><b>Edm Entity Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_ENTITY_TYPE
	 * @model name="EdmEntityType" literal="Edm.EntityType"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_ENTITY_TYPE_VALUE = 1;

	/**
	 * The '<em><b>Edm Primitive Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_PRIMITIVE_TYPE
	 * @model name="EdmPrimitiveType" literal="Edm.PrimitiveType"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_PRIMITIVE_TYPE_VALUE = 2;

	/**
	 * The '<em><b>Edm Untyped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_UNTYPED
	 * @model name="EdmUntyped" literal="Edm.Untyped"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_UNTYPED_VALUE = 3;

	/**
	 * The '<em><b>Edm Geography</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY
	 * @model name="EdmGeography" literal="Edm.Geography"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOGRAPHY_VALUE = 4;

	/**
	 * The '<em><b>Edm Geometry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY
	 * @model name="EdmGeometry" literal="Edm.Geometry"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOMETRY_VALUE = 5;

	/**
	 * The '<em><b>Edm Annotation Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_ANNOTATION_PATH
	 * @model name="EdmAnnotationPath" literal="Edm.AnnotationPath"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_ANNOTATION_PATH_VALUE = 6;

	/**
	 * The '<em><b>Edm Any Property Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_ANY_PROPERTY_PATH
	 * @model name="EdmAnyPropertyPath" literal="Edm.AnyPropertyPath"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_ANY_PROPERTY_PATH_VALUE = 7;

	/**
	 * The '<em><b>Edm Model Element Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_MODEL_ELEMENT_PATH
	 * @model name="EdmModelElementPath" literal="Edm.ModelElementPath"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_MODEL_ELEMENT_PATH_VALUE = 8;

	/**
	 * The '<em><b>Edm Navigation Property Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_NAVIGATION_PROPERTY_PATH
	 * @model name="EdmNavigationPropertyPath" literal="Edm.NavigationPropertyPath"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_NAVIGATION_PROPERTY_PATH_VALUE = 9;

	/**
	 * The '<em><b>Edm Property Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_PROPERTY_PATH
	 * @model name="EdmPropertyPath" literal="Edm.PropertyPath"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_PROPERTY_PATH_VALUE = 10;

	/**
	 * The '<em><b>Collection Edm Complex Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_COMPLEX_TYPE
	 * @model name="CollectionEdmComplexType" literal="Collection(Edm.ComplexType)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_COMPLEX_TYPE_VALUE = 11;

	/**
	 * The '<em><b>Collection Edm Entity Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_ENTITY_TYPE
	 * @model name="CollectionEdmEntityType" literal="Collection(Edm.EntityType)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_ENTITY_TYPE_VALUE = 12;

	/**
	 * The '<em><b>Collection Edm Primitive Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_PRIMITIVE_TYPE
	 * @model name="CollectionEdmPrimitiveType" literal="Collection(Edm.PrimitiveType)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_PRIMITIVE_TYPE_VALUE = 13;

	/**
	 * The '<em><b>Collection Edm Untyped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_UNTYPED
	 * @model name="CollectionEdmUntyped" literal="Collection(Edm.Untyped)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_UNTYPED_VALUE = 14;

	/**
	 * The '<em><b>Collection Edm Geography</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY
	 * @model name="CollectionEdmGeography" literal="Collection(Edm.Geography)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOGRAPHY_VALUE = 15;

	/**
	 * The '<em><b>Collection Edm Geometry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY
	 * @model name="CollectionEdmGeometry" literal="Collection(Edm.Geometry)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOMETRY_VALUE = 16;

	/**
	 * The '<em><b>Collection Edm Annotation Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_ANNOTATION_PATH
	 * @model name="CollectionEdmAnnotationPath" literal="Collection(Edm.AnnotationPath)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_ANNOTATION_PATH_VALUE = 17;

	/**
	 * The '<em><b>Collection Edm Any Property Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_ANY_PROPERTY_PATH
	 * @model name="CollectionEdmAnyPropertyPath" literal="Collection(Edm.AnyPropertyPath)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_ANY_PROPERTY_PATH_VALUE = 18;

	/**
	 * The '<em><b>Collection Edm Model Element Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_MODEL_ELEMENT_PATH
	 * @model name="CollectionEdmModelElementPath" literal="Collection(Edm.ModelElementPath)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_MODEL_ELEMENT_PATH_VALUE = 19;

	/**
	 * The '<em><b>Collection Edm Navigation Property Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_NAVIGATION_PROPERTY_PATH
	 * @model name="CollectionEdmNavigationPropertyPath" literal="Collection(Edm.NavigationPropertyPath)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_NAVIGATION_PROPERTY_PATH_VALUE = 20;

	/**
	 * The '<em><b>Collection Edm Property Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_PROPERTY_PATH
	 * @model name="CollectionEdmPropertyPath" literal="Collection(Edm.PropertyPath)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_PROPERTY_PATH_VALUE = 21;

	/**
	 * An array of all the '<em><b>TAbstract Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TAbstractType[] VALUES_ARRAY =
		new TAbstractType[] {
			EDM_COMPLEX_TYPE,
			EDM_ENTITY_TYPE,
			EDM_PRIMITIVE_TYPE,
			EDM_UNTYPED,
			EDM_GEOGRAPHY,
			EDM_GEOMETRY,
			EDM_ANNOTATION_PATH,
			EDM_ANY_PROPERTY_PATH,
			EDM_MODEL_ELEMENT_PATH,
			EDM_NAVIGATION_PROPERTY_PATH,
			EDM_PROPERTY_PATH,
			COLLECTION_EDM_COMPLEX_TYPE,
			COLLECTION_EDM_ENTITY_TYPE,
			COLLECTION_EDM_PRIMITIVE_TYPE,
			COLLECTION_EDM_UNTYPED,
			COLLECTION_EDM_GEOGRAPHY,
			COLLECTION_EDM_GEOMETRY,
			COLLECTION_EDM_ANNOTATION_PATH,
			COLLECTION_EDM_ANY_PROPERTY_PATH,
			COLLECTION_EDM_MODEL_ELEMENT_PATH,
			COLLECTION_EDM_NAVIGATION_PROPERTY_PATH,
			COLLECTION_EDM_PROPERTY_PATH,
		};

	/**
	 * A public read-only list of all the '<em><b>TAbstract Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TAbstractType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TAbstract Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TAbstractType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TAbstractType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TAbstract Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TAbstractType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TAbstractType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TAbstract Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TAbstractType get(int value) {
		switch (value) {
			case EDM_COMPLEX_TYPE_VALUE: return EDM_COMPLEX_TYPE;
			case EDM_ENTITY_TYPE_VALUE: return EDM_ENTITY_TYPE;
			case EDM_PRIMITIVE_TYPE_VALUE: return EDM_PRIMITIVE_TYPE;
			case EDM_UNTYPED_VALUE: return EDM_UNTYPED;
			case EDM_GEOGRAPHY_VALUE: return EDM_GEOGRAPHY;
			case EDM_GEOMETRY_VALUE: return EDM_GEOMETRY;
			case EDM_ANNOTATION_PATH_VALUE: return EDM_ANNOTATION_PATH;
			case EDM_ANY_PROPERTY_PATH_VALUE: return EDM_ANY_PROPERTY_PATH;
			case EDM_MODEL_ELEMENT_PATH_VALUE: return EDM_MODEL_ELEMENT_PATH;
			case EDM_NAVIGATION_PROPERTY_PATH_VALUE: return EDM_NAVIGATION_PROPERTY_PATH;
			case EDM_PROPERTY_PATH_VALUE: return EDM_PROPERTY_PATH;
			case COLLECTION_EDM_COMPLEX_TYPE_VALUE: return COLLECTION_EDM_COMPLEX_TYPE;
			case COLLECTION_EDM_ENTITY_TYPE_VALUE: return COLLECTION_EDM_ENTITY_TYPE;
			case COLLECTION_EDM_PRIMITIVE_TYPE_VALUE: return COLLECTION_EDM_PRIMITIVE_TYPE;
			case COLLECTION_EDM_UNTYPED_VALUE: return COLLECTION_EDM_UNTYPED;
			case COLLECTION_EDM_GEOGRAPHY_VALUE: return COLLECTION_EDM_GEOGRAPHY;
			case COLLECTION_EDM_GEOMETRY_VALUE: return COLLECTION_EDM_GEOMETRY;
			case COLLECTION_EDM_ANNOTATION_PATH_VALUE: return COLLECTION_EDM_ANNOTATION_PATH;
			case COLLECTION_EDM_ANY_PROPERTY_PATH_VALUE: return COLLECTION_EDM_ANY_PROPERTY_PATH;
			case COLLECTION_EDM_MODEL_ELEMENT_PATH_VALUE: return COLLECTION_EDM_MODEL_ELEMENT_PATH;
			case COLLECTION_EDM_NAVIGATION_PROPERTY_PATH_VALUE: return COLLECTION_EDM_NAVIGATION_PROPERTY_PATH;
			case COLLECTION_EDM_PROPERTY_PATH_VALUE: return COLLECTION_EDM_PROPERTY_PATH;
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
	private TAbstractType(int value, String name, String literal) {
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
	
} //TAbstractType
